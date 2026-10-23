public class TestBoolean {
	public static void main(String[] args) {
		boolean var1;
		boolean var2;

		var1 = true; 
		var2 = var1;

		System.out.println(var1|var2); // OR
		System.out.println(var1&var2); // AND
		System.out.println(var1^var2); // XOR

		var1 = !var1; // NOT
		System.out.println(var1|var2); // OR
		System.out.println(var1&var2); // AND
		System.out.println(var1^var2); // XOR

		System.out.println(var1||var2); // OR ленивый
		System.out.println(var1&&var2); // AND ленивый
	}
}