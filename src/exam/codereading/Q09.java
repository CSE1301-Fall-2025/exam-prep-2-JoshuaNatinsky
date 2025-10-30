package exam.codereading;

public class Q09 {

	public static int fun ( int k) {
		if(k >25) {
			return k;
		} else {
			return fun (k *2 -1)+1;
		}
	}

	public static void main(String[] args) {
		//Use the substitution method to show the evaluation of
		//the following:
		
		System.out.println(fun(4));
	}
}

// fun(4) = fun(7)+1    = 52+1 = 53
// fun(7) = fun(13)+1   = 51+1
// fun(13) = fun(25)+1  = 50+1
// fun(25) = fun(49)+1  = 49+1
// fun(49) = 49