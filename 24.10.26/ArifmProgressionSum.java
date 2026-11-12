public class ArifmProgressionSum {
	public static void main(String[] args) {
		System.out.println(sum(1,3,3));
	}

	public static int sum(int a, int d, int n) {
		if (n == 1) return a;
		return sum(a, d, n - 1) + a + d * (n - 1);
	}
}