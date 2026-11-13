import java.util.Random;

public class SeaBattleField {

	public Ship[] ships;
	public byte countInjuredParts;

	/** 0 - пусто, 1 - ранен, 2 - подбит, 3 - целый корабль, 4 - промах */
	public byte[][] battleField;

	public SeaBattleField() {
		System.out.println("SeaBattleField");
		createField();
	}

	private void createField() {
		ships = new Ship[10];
		battleField = new byte[10][10];

		Random random = new Random();

		byte countShips = 0;

		for (byte i = 1; i <= 4; i++) { // палубы
			for (byte j = i; j <= 4; j++) { // кол-во каждого i-палубного
				while (true) {
					byte xt = (byte)random.nextInt(10);
					byte yt = (byte)random.nextInt(10);
					byte orient = (byte)random.nextInt(2);
					byte[] emptyStatePart = new byte[i];
					if (checkField(i, xt, yt, orient)) {
						if (orient == 0) {
							ships[countShips++] = new Ship(i, xt, yt, xt, (byte)(yt+i-1));
							for (byte k = 0; k < i; k++){
								battleField[yt+k][xt] = 3;
							}
						}
						else {
							ships[countShips++] = new Ship(i, xt, yt, (byte)(xt+i-1), yt);
							for (byte k = 0; k < i; k++){
								battleField[yt][xt+k] = 3;
							}
						}
						break;
					}	
				}
			}
		}
	}

	/** 0 - вертикальная ориентация, 1 - горизонтальная ориентация */
	private boolean checkField(byte size, byte x, byte y, byte orientation) {
		if (orientation == 0) {
			if (y + size > 10) return false;
			for (int i = 0; i < size; i++) {
				if (battleField[y+i][x] == 3) return false;
			}
		}
		else {
			if (x + size > 10) return false;
			for (int i = 0; i < size; i++) {
				if (battleField[y][x+i] == 3) return false;
			}
		}
		return true;
	}

	public void showField() {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(battleField[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	/* Добавить метод:
    выстрел (x,y) - изменение в статусах кораблей, если попали
	 */
	
	public void shoot(byte x, byte y) { // отметки после выстрела на игровом пол
		// проверка валидности координат
		if (x >= 10 || x <= -1 || y >= 10 || y <= -1) return;
		if (battleField[y][x] == 3) {
			Ship ship = findShip(x, y);
			battleField[y][x] = 1;
			System.out.println("Попадание.");
			ship.setStateInjured(x, y); // отмечаем что клетка в корабле ранена

			countInjuredParts++;
			if (isDestroyed(x, y)) {
				System.out.println("Корабль подбит.");
				ship.setState((byte)2);
			}
		} else if (battleField[y][x] == 0) {
			battleField[y][x] = 4;
			System.out.println("Промах.");
		} else {
			System.out.println("В эту клетку уже выстрелили");
		}
	}

	public boolean isDestroyed(byte x, byte y) { // проверка, подбит ли корабль после последнего выстрела по нему
		Ship ship = findShip(x, y);
		byte[] statePart = ship.getStatePart();
		for (int i = 0; i < statePart.length; i++) {
			if (statePart[i] == 0) { // если есть хотя бы одна целая клетка
				return false;
			}
		}
        return true;
	}

	public Ship findShip(byte x, byte y) { // находим, в каком корабле находится клетка
		for (Ship ship : ships) {
			// if (ship == null) continue;
			byte xStart = ship.getxStart();
			byte yStart = ship.getyStart();
			byte xEnd = ship.getxEnd();
			byte yEnd = ship.getyEnd();
			if (xStart == xEnd && xStart == x) {
				for (byte i = yStart; i <= yEnd; i++) {
					if (y == i) {
						return ship;
					}
				}
			} else if (yStart == yEnd && yStart == y) {
				for (byte i = xStart; i <= xEnd; i++) {
					if (x == i) {
						return ship;
					}
				}
			}
		}
		return null;
	}
}


