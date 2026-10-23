public class Exponenta {
	public static void main(String[] args) {
		System.out.println(exp(0));
	}

	static double exp (double x) {
		double s = 1;
		double epsilon = 1e-6;
		double n = 1;
		int count = 1;

		while (n > epsilon || n < (-1)*epsilon) {
			n = s * (x / count);
			s += n;
			count++;
		}
		
		return s;
	}
}