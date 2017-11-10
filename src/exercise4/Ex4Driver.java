package exercise4;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author mngonk01
 */

public class Ex4Driver {
  /* Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task1(Integer i) {
		return i;
             }
public void testTask1() {
        System.out.println("Task1");
        Ex4Driver instance = new Ex4Driver();
        assertEquals(new Integer(10), instance.task1(10));
        assertEquals(new Integer(20), instance.task1(20));
    }
  /* Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task2(String s) {
		if (s == null) {
			return null;
		} else {
			return s.length();
		}
	}
public void testTask2() {
        System.out.println("Task2");
        Ex4Driver instance = new Ex4Driver();
        assertEquals(new Integer(5), instance.task2("Hello"));
        assertEquals(new Integer(0), instance.task2(""));
    }
  /* Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task3(Character c) {
		if (c == null) {
			return null;
		} else if (c >= '0' && c <= '9') {
			return (int)(c - '0');
		} else {
			return -1;
		}
	}
public void testTask3() {
        System.out.println("Task3");
        Ex4Driver instance = new Ex4Driver();
        assertEquals(new Integer(9), instance.task3('9'));
        assertEquals(new Integer(-1), instance.task3('x'));
    }
 /* Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity. */
public Character task4(String s) {
		if (s == null || s.length() == 0) {
			return null;
		} else {
			return s.charAt(0);
		}
	}
public void testTask4() {
        System.out.println("Task4");
        Ex4Driver instance = new Ex4Driver();
        assertEquals(null, instance.task4(""));
        assertEquals(new Character('H'), instance.task4("Hello"));
    }
  /* Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task5(Integer a, Integer b) {
		if (a == null || b == null) {
			return null;
		} else {
			return a+b;
		}
	}
public void testTask5() {
        System.out.println("Task5");
        Ex4Driver instance = new Ex4Driver();
        assertEquals(new Integer(30), instance.task5(10, 20));
        assertEquals(new Integer(50), instance.task5(20, 30));
    }
  /* Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity. */
public Character task6(String s, Integer i) {
		if (s == null || i == null || i < 0 || i >= s.length()) {
			return null;
		} else {
			return s.charAt(i);
		}
	}
public void testTask6() {
        System.out.println("Task6");
        Ex4Driver instance = new Ex4Driver();
        assertEquals(new Character('l'), instance.task6("Hello", 2));
        assertEquals(null, instance.task6("Hello", 10));
    }
  /* Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task7(Integer[] intArray) {
		if (intArray == null) {
			return null;
		} else {
			return intArray.length;
		}
	}
public void testTask7() {
        System.out.println("Task7");
        Ex4Driver instance = new Ex4Driver();
        Integer[] intArray = {10, 20, 30};
        assertEquals(null, instance.task7(null));
        assertEquals(new Integer(3), instance.task7(intArray));
    }
 /* Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity. */
public Boolean task8(Integer[] intArray, Integer value) {
		if (intArray == null) {
			return null;
		} else {
			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i] == value) {
					return true;
				}
			}
			return false;
		}
	}
public void testTask8() {
        System.out.println("Task8");
        Ex4Driver instance = new Ex4Driver();
        Integer[] intArray = {10, 20, 30};
        assertEquals(true, instance.task8(intArray, 20));
        assertEquals(false, instance.task8(intArray, 40));
    }
  /* Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task9(ArrayList<String> list) {
		if (list == null) {
			return null;
		} else {
			return list.size();
		}
	}
public void testTask9() {
        System.out.println("Task9");
        Ex4Driver instance = new Ex4Driver();
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("red");
        assertEquals(new Integer(2), instance.task9(list));
        assertEquals(null, instance.task9(null));
    }
  /* Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task10(HashMap<String, String> map) {
		if (map == null) {
			return null;
		} else {
			return map.size();
		}
	}
public void testTask10() {
        System.out.println("Task10");
        Ex4Driver instance = new Ex4Driver();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("apple", "fruit");
        map.put("red", "color");
        assertEquals(null, instance.task10(null));
        assertEquals(new Integer(2), instance.task10(map));
    }
}
 
=======
/**
 * @author yasiro01
 */
public class Ex4Driver {
  /* Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task1(Integer);
  /* Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task2(String);
  /* Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task3(Character);
 /* Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity. */
//  public Character task4(String);
  /* Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task5(Integer, Integer);
  /* Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity. */
//  public Character task6(String, Integer);
  /* Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task7(Integer[]);
  /* Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity. */
//  public Boolean task8(Integer[], Integer);
  /* Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task9(ArrayList<String>);
  /* Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task10(HashMap<>);
}
>>>>>>> 88fd186154d511b9a19b8cf9557e5382b8d455c2
