import java.util.Scanner;

public class Battle {

	public SeaBattleField seaBattleField;

	public Battle() {
		System.out.println("Battle");
		seaBattleField = new SeaBattleField();
		Ship[] ships = seaBattleField.ships;
		byte countParts = 0;
		for (int i = 0; i < ships.length; i++) {
			countParts += ships[i].getSize();
		}
		Scanner sc = new Scanner(System.in);
		while (seaBattleField.countInjuredParts < countParts) { // если все корабли подбиты, то игра завершена
			seaBattleField.showField();
			System.out.println("Введите X: ");
			byte x = sc.nextByte();
			System.out.println("Введите Y: ");
			byte y = sc.nextByte();
			seaBattleField.shoot((byte)x, (byte)y);
		}
	}
}