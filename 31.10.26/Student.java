public class Student {
	String name;
	int age;
	int height;
	int weight;

	// Student(String name, int age, int height, int weight) {
	// 	this.name = name;
	// 	this.age = age;
	// 	this.height = height;
	// 	this.weight = weight;
	// }

	@Override
	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight;
	}
}
