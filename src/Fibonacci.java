
public class Fibonacci {

	public static int Fib (int n) {
		if (n <= 2){
			return n=1;
		}
		return Fib(n - 1) + Fib(n - 2);
	}

	public static void main(String[] args) {

		int n = 7;

		System.out.println("n = " + Fib(n));
	}
}



/*
public class decodig {
	public static Integer main(String []args) {
		String telephonNumber = "01800888HCL";
		int aux;
		for (int i = 0; j < telephonNumber.length; j++) {




		}
	}
			System.out.println();
}
	}
			}

			Write a function that:
			Given an array of integers, find the largest integer such that its value exist positive and negative.
			in case none is found -1 should be return.

			Example:
			Input:[2,6,-2,4,-6,5] output: 6
			Input:[2,5,5,3,-6,-5] output: 5
			Input:[2,6,3,4,6,5] output: -1

			Restrictions:
			cannot use build-in sort methods. */