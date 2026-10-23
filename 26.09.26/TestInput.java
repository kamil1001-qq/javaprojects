import java.util.Scanner;

public class TestInput{
	public static void main(String[] args){
		int secret=20; // [0;100]
		int maxStep=5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое число");
		boolean iswin = false;
		for(int i = 0; i<maxStep; ++i){
			int num=scanner.nextInt();
			if (num==secret){
				System.out.println("Поздравляю, Вы отгадали число!");
				iswin=true;
				break;
			}
			if (num>secret && i<maxStep-1){System.out.println("Загаданное число меньше");}
			if (num<secret && i<maxStep-1){System.out.println("Загаданное число больше");}
		}
		if (!iswin){System.out.println("К сожалению, вы проиграли");}
	}
}