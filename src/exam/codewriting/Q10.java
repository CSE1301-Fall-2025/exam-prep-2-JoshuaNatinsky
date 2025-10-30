package exam.codewriting; // Solved

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q10 {

	/*
	We wish to create a method to print a string n times all on 
	the same line, where n is a positive integer. For example:

		repeat("hi", 5) would print hihihihihi
		repeat("bye", 3) would print byebyebye

	Complete the method. You may use either iteration or recursion.
	 */
	public static int repeat (String text, int n) {
		if (n==0){
			return 0;
		}

		System.out.print(text);
		return repeat(text, n-1); //fix me
	}

	public static void main ( String[] args ) {
		repeat("hi", 5);
		System.out.println();
		repeat("bye", 3);
	}

}
