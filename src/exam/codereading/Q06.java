package exam.codereading;

public class Q06 {

	public static int f(int n) {
		if (n == 1) {
			return 1;
		}
		else if (n%2 == 0) { // n is even
			return f(n/2); // integer division
		}
		else {
			return f(3*n+1);
		}
	}

	public static void main(String[] args) {
		//Use the substitution method to show the result of the
		//following:
		
		System.out.println(f(3));

	}
}
//f(3) = f(10)		1
//f(10) = f(5)		1
//f(5) = f(16)		1
//f(16) = f(8)		1
//f(8) = f(4)		1
//f(4) = f(2)		1
//f(2) = f(1)		1
//f(1) = 1			Base case