public class Main {
	public static void main(String[] args) {
		Student anna1 = new Student("Анна",20,160,50);
		System.out.println(anna1.name);

		// anna1.name = "Анна";
		// anna1.age = 20;
		// anna1.height = 160;
		// anna1.weight = 50;

		System.out.println("Имя: " + anna1.name + "\nВозраст: " + anna1.age + "\nРост: " + anna1.height + "\nВес: " + anna1.weight);

		Student fedor = new Student("Фёдор", 24,180,80);
		// fedor.name = "Фёдор";
		// fedor.age = 24;
		// fedor.height = 180;
		// fedor.weight = 80;

		System.out.println("\nИмя: " + fedor.name + "\nВозраст: " + fedor.age + "\nРост: " + fedor.height + "\nВес: " + fedor.weight);
		System.out.println("\n" + fedor);
		fedor.age = 25;
		System.out.println("\n" + fedor);
	}
}