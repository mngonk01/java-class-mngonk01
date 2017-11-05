package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author mngonk01
 */
public class Ex1Driver {

    private static Object keyboard;
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("---Task 1---");
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println("\n---Task 2'''");
    for (int i=1; i<=100; i++){
        if (i%3==0 && i%5==0){
            System.out.println("huh");
        }
        else if (i%3==0){
            System.out.println("foo");
        }
        else if (i%5==0){
            System.out.println("bar");
        }
        else {
            System.out.println(i);}
        }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.println("\n---Task 3---");
    int result=0;
    for (int i=1; i<=100; i++){
        if (i%7==0)
            result+=i;
    }
    System.out.println("The sum of all multiples of 7 between 1 and 100 is " +result);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.println("\n---Task 4---");
    int sum=0;
    int i=1;
    while (i<=20){
        sum += i;
        i++;
    } System.out.println("The sum of all numbers between 1 and 20 is " +sum);
    int prod=1;
    for (int j=1; j<=20; j++){
        prod *= j;
    } System.out.println("The product of all numbers between 1 and 20 is " +prod);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println("\n---Task 5---");
    Scanner myKeyboard = new Scanner(System.in);
    System.out.print("Please enter your full name: ");
    String name = myKeyboard.nextLine();
    String[] nameParts = name.split(" ");
    char firstInitial = nameParts[0].charAt(0);
    char middleInitial = nameParts[1].charAt(0);
    char lastInitial = nameParts[2].charAt(0);
    System.out.println("Your initials are: " +firstInitial + middleInitial + lastInitial);
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println("\n---Task 6---");
    int aiFirstArray[] = new int [10];
    for (int a=0; a<aiFirstArray.length; a++){
        aiFirstArray[a]=a*a*a;
    }
    for (int a=0; a<aiFirstArray.length; a++){
        System.out.println(aiFirstArray[a] + " ");
    }
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.println("\n---Task 7---");
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] b = new int[100];
    int number;
    boolean found = false;
    for (int i=0; i<b.length; i++){
    b[i] = rnd.nextInt(100) + 1;
    }
    System.out.print("\nEnter an integer: ");
    number = rnd.nextInt();
    for (int i=0; i<b.length; i++){
    if (b[i] == number){
    found = true;
    break;
        }
    }
    if (found){
        System.out.println(number + "is in the array");
    } else {
        System.out.println(number + "is not in the array");
    }
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    System.out.println("\n---Task 8---");
    for (int i=0; i<numbers.length; i++){
        i += numbers[i];
    }
      int i = 0;
    return i;
  }
  public static boolean isOrdered(String word){
      for (int i=1; i<word.length(); i++){
        if (word.charAt(i-1) > word.charAt(i)){
            return false;
        }
      }
      return true;
  int[] b = null;
  System.out.println("\nSum = " + calculateSum(b));
  }

    
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
     * @param word
   * @return 
   */
  public static boolean isOrdered(String word) {
    System.out.println("\n---Task 9---");
    System.out.print("\nEnter a word: ");
    String word = keyboard.next();
        for (int i=1; i<word.length(); i++){
        if (word.charAt(i-1) > word.charAt(i)){
            return false;
        }
    }
    return true;
     }

    private static String calculateSum(int[] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    if (isOrdered(word)){
      System.out.println("Word letters are ordered");
    } else {
      System.out.println("Word letters are not ordered");
}
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    System.out.println("\n---Task 10---");
    boolean[] prime = new boolean[101];
    for (int i=0; i<prime.length; i++){
        prime[i] = true;
    }
    prime[0]=false;
    prime[1]=false;
    for (int i=2; i*i<prime.length; i++){
        if (prime[i]){
            for (int j=i+1; j<prime.length; j++){
                if (j%i==0){
                    prime[j]=false;
                }
            }
        }
    }
    System.out.println("\nPrime numbers between 1 and 100 are: ");
    for (int i=0; i<prime.length; i++){
        if (prime[i]){
            System.out.print(i + " ");
      }
  }
    System.out.println();
}
}
   