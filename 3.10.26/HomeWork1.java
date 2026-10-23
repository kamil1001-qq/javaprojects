import java.util.Scanner;

public class HomeWork1{
	public static void main(String[] args){

		// X = 2, 0 = 1
		int[][] field = new int[3][3];
		int [][] trans_field = new int[3][3];
		boolean flag1 = false;
		boolean player_win = false;
		boolean computer_win = false;


		int movesPlayerCount = 0;
		Scanner sc = new Scanner(System.in);

		// вывод поля
		for (int i = 0; i < field.length; i++){
			for (int j = 0; j < field[i].length; j++){
				char c = '-';
				if (field[i][j] == 1){ c = '0'; }
				else if (field[i][j] == 2){ c = 'X'; }
				if (j!=0) System.out.print("|");
				System.out.print(c);
			}
			System.out.println();
		}

		while (movesPlayerCount <= 4){
			
			// ход игрока
			while (true){

				System.out.println("\nВаш ход. Куда вы ходите поставить Х? Введите строку: ");
				int row = sc.nextInt();

				System.out.println("Введите столбец: ");
				int column = sc.nextInt();
				
				if (row > 3 | row < 1 | column > 3 | column < 1) { System.out.println("Вы ввели некоректное значение строки/столбца. Повторите попытку."); }

		    	else if(field[row-1][column-1]==0) {
		    		field[row-1][column-1]=2;
		    		break;
		    	}
		    	else { System.out.println("Это поле уже занято, выберите другое"); }
		    }

		    movesPlayerCount++;

		    // вывод поля
		    for (int i = 0; i < field.length; i++){
				for (int j = 0; j < field[i].length; j++){
					char c = '-';
					if (field[i][j] == 1){ c = '0'; }
					else if (field[i][j] == 2){ c = 'X'; }
					if (j!=0) System.out.print("|");
					System.out.print(c);
				}
				System.out.println();
			}

			// проверка 
			// по строкам
			for (int i = 0; i < field.length; i++) {
				if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][2] == 2) {
					player_win = true;
		    		break;
				}
			}

			// по столбцам
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					trans_field[j][i] = field[i][j];
				}
			}

			for (int i = 0; i < trans_field.length; i++) {
				if (trans_field[i][0] == trans_field[i][1] && trans_field[i][1] == trans_field[i][2] && trans_field[i][2] == 2) {
					player_win = true;
		    		break;
				}
			}

			// по диагоналям
			if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[2][2] == 2) {
				player_win = true;
			}

			if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == 2) {
				player_win = true;
			}

			if (player_win){
				System.out.println("Вы победили!");
				break;
			}

			// ход компьютера
			System.out.println("\nХод Компьютера");
		    for (int i = 0; i < field.length; i++){
				for (int j = 0; j < field[i].length; j++){
					flag1=false;

					if (field[i][j]==0){
						field[i][j] = 1;
						flag1 = true;
		    			break;
					}
				}
				if (flag1) break;
			}

			// вывод поля
		    for (int i = 0; i < field.length; i++){
				for (int j = 0; j < field[i].length; j++){
					char c = '-';
					if (field[i][j] == 1){ c = '0'; }
					else if (field[i][j] == 2){ c = 'X'; }
					if (j!=0) System.out.print("|");
					System.out.print(c);
				}
				System.out.println();
			}

			// проверка

			// по строкам
			for (int i = 0; i < field.length; i++) {
				if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][2] == 1) {
					computer_win = true;
		    		break;
				}
			}

			// по столбцам
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					trans_field[j][i] = field[i][j];
				}
			}

			for (int i = 0; i < trans_field.length; i++) {
				if (trans_field[i][0] == trans_field[i][1] && trans_field[i][1] == trans_field[i][2] && trans_field[i][2] == 1) {
					computer_win = true;
		    		break;
				}
			}
			// по диагоналям
			if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[2][2] == 1) {
				player_win = true;
			}

			if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == 1) {
				player_win = true;
			}
			if (computer_win){
				System.out.println("Компьютер победил!");
				break;
			}

			// ничья
			if (movesPlayerCount == 5) {
		    	System.out.println("Ничья!");
		    	break;
		    }
		}
	}
}