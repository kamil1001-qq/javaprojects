public class TestArgs{
	public static void main(String[] args){
		System.out.println(args.length); // можем через консоль передавать значения в массив строк args
		
		String RED = "\u001B[38;2;255;0;0m";
		String GREEN = "\u001B[38;2;0;255;0m";
		String BLUE = "\u001B[38;2;0;0;255m";

		if (args.length > 1 && args[0].equals("-color")){
			// if (args[1].equals("red")) {
			// 	System.out.print(RED);
			// }
			// if (args[1].equals("blue")) {
			// 	System.out.print(BLUE);
			// }
			// if (args[1].equals("green")) {
			// 	System.out.print(GREEN);
			// }
			// System.out.println("Цвет установлен");

			// можно через if но давайте через switch case

			switch(args[1]){
			case "red":
				System.out.print(RED);
				break;
			case "green":
				System.out.print(GREEN);
				break;
			case "blue":
				System.out.print(BLUE);
				break;
			}
			System.out.println("Цвет установлен");

		}
	}
}