package exercise6;

<<<<<<< HEAD
import java.util.HashSet;
import java.util.Scanner;

/**
 * Class LemurConspiracy
 * @author mngonk01
 */
public class LemurConspiracy {
    private HashSet<Lemur> hset = new HashSet<Lemur>();
		
		LemurConspiracy(String fileName)
		{
			 Scanner scan = new Scanner(fileName);
		     while(scan.hasNextLine()){
		    	 Lemur e = null;
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
		
		public Lemur getChief()
		{
			int small=0;
			Lemur ret = null;
			
			for (Lemur s : hset) 
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
        LemurConspiracy lemur = new LemurConspiracy("zoo1.txt");
        LemurConspiracy lemur1 = new LemurConspiracy("zoo2.txt");
    }
=======
/**
 * Class LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {
>>>>>>> 1bdcbc89116c0a96986d2880daee73a48df9a144
}
