package exam.codewriting; // SOLVED

import edu.princeton.cs.introcs.StdDraw;

public class Q12 {

	public static void rDraw ( double xCtr , double yCtr , double size ) {
		if (size <= .001 ){
			return;
		}
		if (size > .05){
			StdDraw.square(xCtr, yCtr, size);
		}
		else{
			StdDraw.circle(xCtr, yCtr, size);
			
		}

		rDraw(xCtr-size, yCtr+size, size/2); // Top left
		rDraw(xCtr+size, yCtr-size, size/2); // Bottom right


	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image03.png" in the images folder.

		//Your solution must use recursion

		rDraw (0.5 , 0.5 , 0.25);
	}

}
