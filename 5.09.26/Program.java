public class Program {
	public static void main(String[] args) {
		System.out.println("Java \nработает");
		int var1 = 0b1010_1001;
		int var2 = 0x1AB43; 

		float var3 = 1f;

		System.out.print("\t\tJava работает");
		System.out.println("Java\n\tработает");

		System.out.println("\u0416 \u041A \u0411");
		System.out.println('А');
		System.out.println((int)'А');


		System.out.println("10"+"5");
		System.out.println("10"+5);
		System.out.println("10"+5+10);
		System.out.println("10"+(5+10));

		System.out.println('\\' + (5+10)); // 107
		System.out.println((char)('А'+1)); // Б

		/* многострочный
			комментарий
		*/

		// операции

		int a1 = 10;
		int a2 = 20;
		System.out.println(a1/a2);
		System.out.println((float)a1/a2);
		System.out.println(a1*1.0/a2);
		System.out.println(a1%a2);

		System.out.println(a1++); // инкремент после использования выражения
		System.out.println(a1);
		System.out.println(++a1);  // инкремент до использования выражения

		a1=10;
		System.out.println(a1++ + 10);
		System.out.println(a1++);
	}
}