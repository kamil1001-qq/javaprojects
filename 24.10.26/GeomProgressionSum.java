public class GeomProgessionSum {
	public static void main(String[] args) {
		System.out.println(sum(3,2,3));
	}

	public static int sum(int n, int p, int q) {
		if (n == 1) return p;
		int q2 = 1;
		for (int i = 0; i < n - 1; i++) {
			q2 *= q;
		}
		return sum(n - 1, p, q) + p*q2;
	}
}