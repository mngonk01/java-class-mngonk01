package exercise2;

import java.util.*;

/**
 * @author mngonk01
 */
public class Ex2Driver {

    public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println();
    task2(numberArr, 90);
    System.out.println();
    task3(numberArr, 75);
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(
    task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row.
   * @param n
   */
  public static void task1(int n) {
    		System.out.println();
		int[] a = {50, 30, 20, 10, 40};
		System.out.print("Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
                Random random = new Random();
		
		while (n > 0) {
			if (random.nextInt(2) == 0) {
				System.out.print("Heads ");
				n--;
			} else {
				System.out.print("Tails ");
			}
		}
		
		System.out.println();
	}

   /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
        n = keyboard.nextInt();
	System.out.println(n + " is larger than every element of the array? " + isLarger(arr, n));
	System.out.println();
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= n) {
        return false;
	}   
	return true;
	}
  
  
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static task3(int[] arr, int threshold) {
    countBelow(arr, threshold);
    System.out.println();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
		if (arr[i] < threshold) {
			count++;
    }
    
    System.out.println("Number of values below " + threshold + " is " + count);
	}

 
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
                addDifference(arr);
		System.out.print("Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.println();
                int largest;
		if (arr.length == 0) {
			return;
		}
		largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
		}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 100 - largest;
		}
	}

    
  
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    printGradeCount(arr);
    System.out.println();
    int A = 0, B = 0, C = 0, D = 0, F = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 90) {
				A++;
			} else if (arr[i] >= 80) {
				B++;
			} else if (arr[i] >= 70) {
				C++;
			} else if (arr[i] >= 60) {
				D++;
			} else {
				F++;
			}
		}
		System.out.println("Number of A grades: " + A);
		System.out.println("Number of B grades: " + B);
		System.out.println("Number of C grades: " + C);
		System.out.println("Number of D grades: " + D);
		System.out.println("Number of F grades: " + F);
	}

    
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    ArrayList<Double> arr = new ArrayList();
    System.out.println("Enter numbers (0 to stop):");
		double number = keyboard.nextDouble();
		while (number != 0) {
			list.add(number);
			number = keyboard.nextDouble();
		}
		System.out.print("ArrayList:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i));
		}
		System.out.println();
		System.out.println();
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			intList.add(random.nextInt(51)+50);
		}
		System.out.print("ArrayList:");
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(" " + intList.get(i));
		}
		System.out.println();
		System.out.println();
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.println("Number of values in the ArrayList below 75 is " +
			countBelow75(intList));
		System.out.println();
                int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 75) {
				count++;
		}
		}
		return count;
	}
  
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    int[][] b = new int[10][10];
    for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < b[i].length; j++) {
		b[i][j] = (i+1)*(j+1);
		}
		}
    for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%4d", b[i][j]);
			}
			System.out.println();
    }
		System.out.println();
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    for (int i = 0; i < b.length; i++) {
                int sum = 0;
        	for (int j = 0; j < b[i].length; j++) {
			sum += b[i][j];
                }
		System.out.println("Sum of values in row# " + (i+1) + ": " + sum);
		}
		for (int j = 0; j < b[0].length; j++) {
			int sum = 0;
		for (int i = 0; i < b.length; i++) {
				sum += b[i][j];
			}
		System.out.println("Sum of values in column# " + (j+1) + ": " + sum);
}
  
  
