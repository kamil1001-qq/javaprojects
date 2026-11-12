public class LexikographSort {
	public static void main (String[] args) {

		for (char c = 'а'; c <= 'я'; c++) {
			System.out.println(c + " - " + (int)c);
		}
		System.out.println("ё - " + (int)'ё');
		System.out.println(compare('л','ю'));
		System.out.println(compare('ё','ё'));
		System.out.println(compare('ё','е'));
		System.out.println(compare('ё','ж'));
		System.out.println(compare("камиль", "камин"));
		String[] b = {"привет", "школа", "арбуз", "арбун"};
		sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

	static int compare(char a, char b) {
		if (a == 'ё' && b != 'ё') {
			if (b >= 'ж') return -1;
			if (b <= 'е') return 1;
		}

		else if (b == 'ё' && a != 'ё') {
			if (a >= 'ж') return 1;
			if (a <= 'е') return -1;
		}

		return a - b; // если < 0, то a раньше b. если = 0, то одинаковые. если > 0, то b раньше a
	}

	public static int compare(String a, String b) {
		int minLength = a.length() > b.length() ? b.length() : a.length();
		for (int i = 0; i < minLength; i++) {
			if (compare(a.charAt(i), b.charAt(i)) != 0) return compare(a.charAt(i), b.charAt(i));
		}
		return a.length() - b.length();
	}

	public static void sort(String[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (compare(a[j], a[j + 1]) > 0) {
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}