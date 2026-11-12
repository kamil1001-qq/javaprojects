public class Fibonacci {
	public static void main(String[] args) {
		int[] a = new int[10]; 
		
		// через цикл
		// fillArrayByFibonacci(a);
		// for (int i: a) {
		// 	System.out.print(i + " ");
		// } // 

		// через рекурсию
		for (int i = 0; i < a.length; i++) {
			a[i] = fibonacci(i);
			System.out.print(a[i] + " ");
		}

	}


	public static void fillArrayByFibonacci (int[] a) {
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return fibonacci(n-2) + fibonacci(n-1);
	}
}