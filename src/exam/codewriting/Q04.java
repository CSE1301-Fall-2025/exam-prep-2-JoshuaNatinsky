package exam.codewriting; // NOT SOLVED

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q04 {

	/*
	We wish to create a method to create and fill an array of doubles. Complete the fillDoubleArray
	method below by first creating an array of doubles of size n. You should then iterate through the array
	and fill it by reading doubles from the Scanner in parameter. The method should then return the filled
	array.
	 */
	public static double[] fillDoubleArray (int n, Scanner in) {
		double arr[] = new double[n];

		for (int i = 0; i < n; i++){
			arr[i] = in.nextDouble();
		}

		return arr;
	}


	/*
	We wish to make a program that draws user-defined polygons. You should first request the user to specify
	how many sides the polygon should have. Then, use the fillDoubleArray method from the previous
	part to create the two necessary arrays before drawing the polygon. The main method has already been
	started for you:
	 */
	public static void main ( String[] args ) {
		Scanner in = new Scanner ( System .in );
		int n = in.nextInt();
		if (n < 3) {
			System.err.println("Number of sides must be at least 3.");
			in.close();
			return;
		}
		double arrX [] = fillDoubleArray(n, in);
		double arrY [] = fillDoubleArray(n, in);
		StdDraw.filledPolygon(arrX, arrY);
		in.close();
	}

}
