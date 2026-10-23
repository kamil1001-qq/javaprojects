public class Sinus {
	public static void main(String[] args) {
		System.out.println(sin(3.1415));
	}

	static double sin(double x) {
		double epsilon = 1e-6;
		int sign = -1;
		int count = 1;
		double sin = x;
		double a = x;

		while (a > epsilon || a < -epsilon) {
			a = a * x * x / ((count + 1) * (count + 2));
			sin += a;
			count += 2;
		}

		return sin;
	}
}