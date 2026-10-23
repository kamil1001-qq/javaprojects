public class sheet{
	public static void main(String[] args){
		boolean var1 = true;
		boolean var2 = true;
		System.out.println("--------------------------------------------------");
		System.out.println("| var1  | var2  | |(OR) | &(AND) | ^(XOR) | !(NOT) |");
		System.out.println("--------------------------------------------------");

		System.out.println("| " + var1 + "  | " + var2 + "  | " + (var1 | var2) + "  |  " + (var1&var2) + "  |  " + (var1^var2) + " |  " + (!var1) + " |");
		System.out.println("--------------------------------------------------");
		var2=false;
		System.out.println("| " + var1 + "  | " + var2 + " | " + (var1 | var2) + "  | " + (var1&var2) + "  |  " + (var1^var2) + "  |  " + (!var1) + " |");
		System.out.println("--------------------------------------------------");
		var1=false;
		var2=true;
		System.out.println("| " + var1 + " | " + var2 + "  | " + (var1 | var2) + "  | " + (var1&var2) + "  |  " + (var1^var2) + "  |  " + (!var1) + "  |");
		System.out.println("--------------------------------------------------");
		var2=false;
		System.out.println("| " + var1 + " | " + var2 + " | " + (var1 | var2) + " | " + (var1&var2) + "  |  " + (var1^var2) + " |  " + (!var1) + "  |");
		System.out.println("--------------------------------------------------");


	}
}