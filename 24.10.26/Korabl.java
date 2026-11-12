import java.util.Scanner;

public class Korabl {
	public static void main(String[] args) {
		scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		attack(x,y);
	}

	public static void attack(int x, int y) {
		int[] a = new int[10][10];

		int count = 0; 
		int popadaniya = 0;

		// пусть корабль расположен горизонтально
		for (int i = 0; i < 4; i++) {
			a[x][i+y] = 1;
		}


		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				count++;
				if (a[i][j] == 1) {
					if (a[i][j+1] == 1) {
						popadaniya += 4
					}
					else if (a[i+1][j] == 1) {
						popadaniya += 4;
					}
				}
			} //// ???????
		}
	}
}