package exercise6;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Class KangarooMob
 * @author mngonk01
 */
public class KangarooMob {
    private HashSet<Kangaroo> hset = new HashSet<Kangaroo>();
		
		KangarooMob(String fileName)
		{
			 Scanner scan = new Scanner(fileName);
		     while(scan.hasNextLine()){
		    	 Kangaroo e = null;
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
		
		public Kangaroo getChief()
		{
			int small=0;
			Kangaroo ret = null;
			
			for (Kangaroo s : hset) 
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
        KangarooMob kangaroo = new KangarooMob("zoo1.txt");
        KangarooMob kangaroo1 = new KangarooMob("zoo2.txt");
    }
}
