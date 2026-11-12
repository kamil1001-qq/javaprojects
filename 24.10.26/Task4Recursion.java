public class Task4Recursion {
	public static void main(String[] args) {
		digits(123);
	}

	public static void digits(int n) {
		if (n < 10) System.out.print(n % 10);
		else { 
			digits(n / 10);
			System.out.print(" " + n % 10);	
		}
	}
}