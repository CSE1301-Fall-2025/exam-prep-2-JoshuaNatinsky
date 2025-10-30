package exam.codewriting; // Solved

import edu.princeton.cs.introcs.StdDraw;

public class Q02 {

	/**
	* Draw a dashed line from (x,0) to (x,1)
	* on a standard StdDraw canvas. The length of the
	* dashes and the space between the dashes should
	* both be 0.02.
	* @param x is the x coordinate for the dashed line
	*
	**/
	public static void dashedLine(double x) {
		double y1 = 0;
		double y2 = 0.02;

		dashedLineHelp(x, y1, y2);
	}

	public static void dashedLineHelp (double x, double y1, double y2){
		if (y2 >= 1){
			return;
		}
		
		StdDraw.line(x, y1, x, y2);
		dashedLineHelp(x, y1+0.04, y2+0.04);
	}

	public static void main(String[] args) {
		dashedLine(0.25);
	}

}
