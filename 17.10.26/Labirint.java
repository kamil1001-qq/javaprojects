import java.util.Scanner;

public class Labirint {
	static byte field[][] = {
		{1, 0, 1, 1, 1},
		{1, 0, 0, 1, 1},
		{1, 1, 0, 1, 1},
		{1, 0, 0, 0, 0},
		{1, 1, 1, 1, 1}
	}; // поле из 1/0

	static char status[][] = {
		{'-', '*', '-', '-', '-'},
		{'-', '-', '-', '-', '-'},
		{'-', '-', '-', '-', '-'}, 
		{'-', '-', '-', '-', '-'}, 
		{'-', '-', '-', '-', '-'}
	}; // состояние поля (#, *, x)

	static int positionRow = 0;
	static int positionColumn = 1;

	static int exitRow = 3;
	static int exitColumn = 4;

	static int countStep = 0;

	public static void main(String[] args) {
		while (!isWin()) {
			showStatus();
			moves();
		}
		showStatus();
		System.out.println("Победа! Вы прошли лабиринт за " + countStep + " шагов");
	}

	public static void showStatus() { // вывод состояния поля
		for (int i = 0; i < status.length; i++) {
			for (int j = 0; j < status[i].length; j++) {
				System.out.print(status[i][j]);
			}
			System.out.println();
		}
	}

	static String getDirection() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введите направление:");
			String direction = scanner.nextLine();
			switch (direction) {
				case "U": case "D": case "L": case "R": 
				case "u": case "d": case "l": case "r": 
					return direction;
				default:
					System.out.println("Вы ввели неверный символ! Допустимые символы: U, D, L, R");
			}
		}
	}

	static void moves() {
		String direction = getDirection();
		countStep++;
		switch (direction) {
			case "U": case "u":
				if (positionRow == 0) {
					break;
				}
				if (field[positionRow - 1][positionColumn] == 0) {
					status[positionRow - 1][positionColumn] = '*';
					status[positionRow][positionColumn] = '#';
					positionRow --;
				}

				else {
					status[positionRow - 1][positionColumn] = 'x';
				}
				break;

			case "D": case "d":
				if (positionRow == field.length - 1) {
					break;
				}
				if (field[positionRow + 1][positionColumn] == 0) {
					status[positionRow + 1][positionColumn] = '*';
					status[positionRow][positionColumn] = '#';
					positionRow ++;
				}

				else {
					status[positionRow + 1][positionColumn] = 'x';
				}
				break;

			case "L": case "l":
				if (positionColumn == 0) {
					break;
				}
				if (field[positionRow][positionColumn - 1] == 0) {
					status[positionRow][positionColumn - 1] = '*';
					status[positionRow][positionColumn] = '#';
					positionColumn --;
				}

				else {
					status[positionRow][positionColumn - 1] = 'x';
				}
				break;

			case "R": case "r":
				if (positionColumn == field[0].length - 1) {
					break;
				}
				if (field[positionRow][positionColumn + 1] == 0) {
					status[positionRow][positionColumn + 1] = '*';
					status[positionRow][positionColumn] = '#';
					positionColumn ++;
				}

				else {
					status[positionRow][positionColumn + 1] = 'x';
				}
				break;
		}
	}

	static boolean isWin() {
		return (positionRow == exitRow && positionColumn == exitColumn);
	}

	// описать структуру данных
	// вывод состояния
	// ввод направления
	// анализ хода, пересчет состояния
}