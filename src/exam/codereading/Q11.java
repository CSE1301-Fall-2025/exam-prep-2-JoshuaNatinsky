package exam.codereading;

public class Q11 {

	public static int left ( int [] x, int index ) {
		if( index > 0) {
			System .out. println (x[ index ]);
			return x[ index - 1];
		} else {
			return x[ index ];
		}
	}
	public static int right ( int x) {
		if(x > 0) {
			return (x % 3) + 3;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		//What gets printed?

		//part 1
		int [] a = {1, 3, 1};
		System.out.println ( left (a, 1));

		//part 2
		int [] b = {2, 3, 7, 1, 3, 9};
		for ( int i = 3; i < 7; i += 2) {
			int x = right (i);
			System.out.println ( left (b, x ));
		}

		//part 3
		int [] c = {2, 3, 7, 1, 3, -1};
		int x = c [2]; //x=-4
		while (x != 2) {
			x = right (x);
			x = right (x); //5
			x -= left (c, x); //2
			System .out. println (x);
		}
	}
}

//3        //Right
//1

//1    i=3  x=3
//7
//9    i=5  x=5
//3

//3    x=7  //Right
//3
//1    x=3
//-4
//-1   x=-4
//2
