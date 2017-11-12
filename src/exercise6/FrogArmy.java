package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class FrogArmy
 * @author mngonk01
 */
public class FrogArmy {
    private ArrayList<Frog> list=new ArrayList<Frog>();
		
		FrogArmy(String fileName)
		{
			 Scanner scan = new Scanner(fileName);
		     while(scan.hasNextLine()){
		    	 Frog e = null;
		    	 e.name=scan.next();
		    	 e.age= Integer.parseInt(scan.next());
		    	 list.add(e);
		         scan.nextLine();
		     }
		     scan.close();
		}
		
		public int size()
		{
			return list.size();
		}
		
		public Frog getChief()
		{
			int small=0;
			Frog ret = null;
			
			for (Frog s : list) 
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
       FrogArmy frog = new FrogArmy("zoo1.txt");
       FrogArmy frog1 = new FrogArmy("zoo2.txt");
    }
}
