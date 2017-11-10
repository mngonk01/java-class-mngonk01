package exercise5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author mngonk01
 */
public class Roster {
  private ArrayList<Student> studentlist;
    private Object studentList;
  
  public Roster(String filename){
      Scanner reader = null;
      ArrayList<Student> studentList = new ArrayList<Student>();
      
      try {
          reader = new Scanner(new File(filename));
      } catch (FileNotFoundException e)  {
          System.out.println("Error: could not open file '" + filename + "'");
          System.exit(0);
      }
      while (reader.hasNextLine()){
          String[] fields = reader.nextLine().split(",");
          String name = fields[0];
          String major = fields[1];
          double gpa = Double.parseDouble(fields[2]);
          Student student = new Student(name, major, gpa);
          studentList.add(student);
     }
      reader.close();
  }
  public void printRoster(){
      for (int i = 0; studentList.size()>=i; i++){
          System.out.println(studentList.get(i));
          System.out.println("--------------------------");
    }
 
  }
  public static void main(String[] args){
      Roster roster = new Roster("roster.csv");
      roster.printRoster();
  }
}



