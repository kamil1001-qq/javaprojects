import java.util.Scanner;

public class TicTacToe{
	public static void main(String[] args){
		int field=0; // заполнено/не заполнено по правым 9ти битам
		int crossZero=0; // х/о 
		boolean flag1 = false;
		boolean flag2 = false;
		int movesPlayerCount = 0;
		Scanner sc = new Scanner(System.in);

		int mask1 = 0b111000000;
	    int mask2 = 0b111000;
	    int mask3 = 0b111;
	    int mask4 = 0b100100100;
	    int mask5 = 0b10010010;
	    int mask6 = 0b1001001;
	    int mask7 = 0b100010001;
	    int mask8 = 0b1010100;
	    for(int i = 1; i <= 3; i++) { // цикл по строкам
			for(int j = 1; j <= 3; j++){
				int mask = 1<<(3 * i-j);
				int value = field & mask;
				char c = '-';

				if (value>0){
					value = crossZero & mask;
					if (value>0) c='X';
					else c ='0';
				}

				if (j!=1) System.out.print("|");
				System.out.print(c);
			}
			System.out.println();
		}
		while (movesPlayerCount <= 4){
			while (true){
				System.out.println("\nВаш ход. Куда вы ходите поставить Х? Введите строку: ");
				int row = sc.nextInt();

				System.out.println("Введите столбец: ");
				int column = sc.nextInt();

				int maskMove = 1<<(3*row-column);
				int value = field & maskMove;
		    	if(value==0) {
		    		field = field | (1 << (3 * row - column));
		    		crossZero = crossZero | (1 << (3 * row - column));
		    		break;
		    	}
		    	else { System.out.println("Это поле уже занято, выберите другое"); }
		    }
		    for(int i =1; i<=3; i++){ // цикл по строкам
				for(int j=1; j<=3; j++){
					int mask=1<<(3*i-j);
					int value = field & mask;
					char c = '-';

					if (value>0){
						value = crossZero & mask;
						if (value>0) c='X';
						else c ='0';
					}

					if (j!=1) System.out.print("|");
					System.out.print(c);
				}
				System.out.println();
			}
			movesPlayerCount++;
		    if (movesPlayerCount == 5) {
		    	System.out.println("Ничья!");
		    	break;
		    }
		    // проверка на победу
		    if ((field & mask1) == mask1) {
		    	if ((crossZero & mask1) == mask1) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask1) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask2) == mask2) {
		    	if ((crossZero & mask2) == mask2) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask2) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask3) == mask3) {
		    	if ((crossZero & mask3) == mask3) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask3) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask4) == mask4) {
		    	if ((crossZero & mask4) == mask4) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask4) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask5) == mask5) {
		    	if ((crossZero & mask5) == mask5) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask5) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask6) == mask6) {
		    	if ((crossZero & mask6) == mask6) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask6) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask7) == mask7) {
		    	if ((crossZero & mask7) == mask7) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask7) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask8) == mask8) {
		    	if ((crossZero & mask8) == mask8) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask8) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }

		    System.out.println("\nХод Компьютера");
		    for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 3; j++) {
					flag1=false;
					int mask=1<<(3*i-j);
					int value = field & mask;

					if (value==0){
						field = field | (1 << (3 * i - j));
						flag1 = true;
		    			break;
					}
				}
				if (flag1) break;
			}
			for(int i = 1; i <= 3; i++) { // цикл по строкам
				for(int j = 1; j <= 3; j++){
					int mask = 1<<(3 * i-j);
					int value = field & mask;
					char c = '-';

					if (value>0){
						value = crossZero & mask;
						if (value>0) c='X';
						else c ='0';
					}

					if (j!=1) System.out.print("|");
					System.out.print(c);
				}
				System.out.println();
			}
			// проверка на победу
		    if ((field & mask1) == mask1) {
		    	if ((crossZero & mask1) == mask1) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask1) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask2) == mask2) {
		    	if ((crossZero & mask2) == mask2) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask2) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask3) == mask3) {
		    	if ((crossZero & mask3) == mask3) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask3) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask4) == mask4) {
		    	if ((crossZero & mask4) == mask4) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask4) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask5) == mask5) {
		    	if ((crossZero & mask5) == mask5) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask5) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask6) == mask6) {
		    	if ((crossZero & mask6) == mask6) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask6) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask7) == mask7) {
		    	if ((crossZero & mask7) == mask7) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask7) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		    if ((field & mask8) == mask8) {
		    	if ((crossZero & mask8) == mask8) {
		    		System.out.println("Вы победили!");
		    		break;
		    	}
		    	if ((crossZero & mask8) == 0) {
		    		System.out.println("Компьютер победил!");
		    		break;
		    	}
		    }
		}
	}
}