package exercise3;

import java.util.*;
import java.io.*;
/**
 *
 * @author mngonk01
 */
public class Ex3Driver {
  // main method
	public static void main(String[] args) {
		// Scanner object to read from file "matrix1.txt"
		Scanner reader1 = null;
		
		try {
			// open matrix1.txt file
			reader1 = new Scanner(new File("matrix1.txt"));
		} catch (FileNotFoundException e) {
			// if file does not exist
			System.out.println("Error: could not open file 'matrix1.txt'");
			return;
		}
		
		// Scanner object to read from file "matrix2.txt"
		Scanner reader2 = null;
		
		try {
			// open matrix2.txt file
			reader2 = new Scanner(new File("matrix2.txt"));
		} catch (FileNotFoundException e) {
			// if file does not exist
			System.out.println("Error: could not open file 'matrix2.txt'");
			// close matrix1.txt file
			reader1.close();
			return;
		}
		
		// read size of matrix1
		int m = reader1.nextInt();
		int n = reader1.nextInt();
		
		// read size of matrix2
		int p = reader2.nextInt();
		int q = reader2.nextInt();
		
		// print the size of the matrix in each file
		System.out.println("size of matrix1: " + m + " x " + n);
		System.out.println("size of matrix2: " + p + " x " + q);
		
		// check if the input matrices can be multiplied
		if (n != p) {
			// print error message
			System.out.println("Error: number of columns in matrix1 is not equal to number of rows in matrix2");
			// close matrix1.txt
			reader1.close();
			// close matrix2.txt
			reader2.close();
		}
		
		// create 2-D array for matrix1
		int[][] matrix1 = new int[m][n];
		
		// read contents of matrix1 from file
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix1[i][j] = reader1.nextInt();
			}
		}
		
		// close matrix1.txt
		reader1.close();
		
		// create 2-D array for matrix2
		int[][] matrix2 = new int[p][q];
		
		// read contents of matrix2 from file
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				matrix2[i][j] = reader2.nextInt();
			}
		}
		
		// close matrix2.txt
		reader2.close();
		
		// create 2-D array for storing multiplication of matrix1 and matrix2
		int[][] matrix3 = new int[m][q];
		
		// implement the matrix multiplication algorithm
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				matrix3[i][j] = 0;
				
				for (int k = 0; k < n; k++) {
					matrix3[i][j] = matrix3[i][j] + matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		
		// PrintWriter object to write to file "matrix3.txt"
		PrintWriter writer = null;
		
		try {
			// open "matrix3.txt" file
			writer = new PrintWriter(new File("matrix3.txt"));
		} catch (FileNotFoundException e) {
			// if file does not exist
			System.out.println("Error: could not open file 'matrix3.txt'");
			return;
		}
		
		// write size of matrix3
		writer.println(m + " " + q);
		
		// write the matrix3 to the file
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				if (j != 0) {
					writer.print(" ");
				}
				
				writer.print(matrix3[i][j]);
			}
			
			writer.println();
		}
		
		// close matrix3.txt
		writer.close();
	}
}