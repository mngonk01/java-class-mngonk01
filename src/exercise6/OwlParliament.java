package exercise6;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Class OwlParliament
 * @author mngonk01
 */
public class OwlParliament {
    private HashSet<Owl> hset = new HashSet<Owl>();
		
		OwlParliament(String fileName)
		{
			 Scanner scan = new Scanner(fileName);
		     while(scan.hasNextLine()){
		    	 Owl e = null;
		    	 e.name=scan.next();
		    	 e.age= Integer.parseInt(scan.next());
		         hset.add(e);
		         scan.nextLine();
		     }
		     scan.close();
		}
		
		public int size()
		{
			return hset.size();
		}

		public Owl getChief()
		{
			int small=0;
			Owl ret = null;
			
			for (Owl s : hset) 
			{
				if(s.age>=small)
				{
					small=s.age;
					ret=s;
				}
		    }
			return ret;
		}
        public static void main(String[] args) {
        OwlParliament owl = new OwlParliament("zoo1.txt");
        OwlParliament owl1 = new OwlParliament("zoo2.txt");
    }
}