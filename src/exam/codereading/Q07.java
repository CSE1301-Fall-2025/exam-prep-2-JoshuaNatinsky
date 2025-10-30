package exam.codereading;

public class Q07 {

	public static int prod ( int a, int b, int c) {
		System .out. println ("A: " + a);
		return a*b*c;
	}
	
	public static double root (int a, int b, int c) {
		double x = sq(b);
		System .out. println ("X: " + x);
		double y = prod (a, c, -4); // y = -60
		double z = prod (1, 2, a); // z = 6
		return (-b + Math . sqrt (x+y)) / z; // -4 + sqrt(-44) /6
	}
	
	public static int sq( int x) {
		System .out. println ("Sq: " + x);
		return prod (1, x, x);
	}
	
	public static void main(String[] args) {
		//What gets printed?
		
		System.out.println( prod (4 ,2 ,1));
		
		System.out.println(sq (4));
		
		double d = root (3 ,4 ,5); // No println ()
	}
}

//A: 4
//8

//Sq: 4
//A: 1
//16

//Sq: 4
//A: 1
//X: 16.0
//A: 3
//A: 1
//

