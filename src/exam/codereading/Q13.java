package exam.codereading;

public class Q13 {

	public static int turn ( int x) {
		return (x + 1) % 4;
	}
	public static int angle ( int x, int y) {
		System.out.println (x + y);
		return x + turn (y);
	}

	public static void main(String[] args) {
		//What will get printed?

		//part 1
		int x = angle (3, 4); //4
		int y = turn (7);  //0
		System.out.println ( angle (x, y ));

		//part 2
		for ( int i = 3; i < 7; i += 2) {
			int z = turn (i * 3); //0
			System .out. println ( angle (4, z ));
		}

		//part 3
		int v = 2;
		int w = 3;
		while (v < 5) {
			System .out. println (w);
			v = angle (v, w); //v=5
			w = turn (w); // w=2
		}
	}
}

//7
//4
//5

//6    i=3
//7
//4    i=5
//5

//3
//5
//0
//2
//1
//4
