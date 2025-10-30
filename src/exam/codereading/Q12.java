package exam.codereading;

public class Q12 {

	public static int foo ( int n) {
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			return 2 * foo (-n);
		} else {
			return foo (n + 1) + 1;
		}
	}

	public static void main(String[] args) {
		//Use the substitution method to show the computation of
		//the following:
		
		System.out.println(foo(3));
	}
}


// foo(3) = 2 foo(-3) = 2*4 = 8
// foo(-3) = foo(-2) +1 = 3+1 = 4
// foo(-2) = foo(-1) +1 = 2+1 = 3
// foo(-1) = foo(0) +1 = 1+1 = 2
// foo(0) = 1