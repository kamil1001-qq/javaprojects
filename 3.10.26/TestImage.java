public class TestImage{
	public static void main(String[] args){
		String RECTANGLE = "\u2588";
		String RED = "\u001B[38;2;255;0;0m";
		System.out.print(RED);

		int[][] a = new int[][] {
			{0xa190ff, 0x00FF80},
			{0xc5a070, 0x60aa80}
		};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("\u001B[38;2;" + 
					 (a[i][j]>>16) + ";" + 
					 ((a[i][j]>>8) & 0x00ff) +";" + 
					 (a[i][j] & 0xff) + "m");
				System.out.print(RECTANGLE);
			}
			System.out.println();
		}

		String RESET = "\u001B[0m";
		System.out.println(RESET);
	}
}

