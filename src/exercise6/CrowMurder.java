package exercise6;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class CrowMurder
 * @author mngonk01
 */
public class CrowMurder {
    private ArrayList<Crow> list=new ArrayList<Crow>();
		
		CrowMurder(String fileName)
		{
			 Scanner scan = new Scanner(fileName);
		     while(scan.hasNextLine()){
		    	 Crow e = null;
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
		
		public Crow getChief()
		{
			int small=0;
			Crow ret = null;
			
			for (Crow s : list) 
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
        CrowMurder crow = new CrowMurder("zoo1.txt");
        CrowMurder crow1 = new CrowMurder("zoo2.txt");
    }
=======
/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
>>>>>>> 1bdcbc89116c0a96986d2880daee73a48df9a144
}
