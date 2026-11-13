public class Ship {
	private byte size;

	// система координат: 0-9 (Х), 0-9 (Y)
	private byte xStart;
	private byte yStart;

	private byte xEnd;
  	private byte yEnd;

 	private byte[] statePart; // 0 - целый, 1 - ранен, 2-подбит

 	public Ship(byte size, byte xStart, byte yStart, byte xEnd, byte yEnd) {
 		this.size = size;
 		this.xStart = xStart;
 		this.yStart = yStart;
 		this.xEnd = xEnd;
 		this.yEnd = yEnd;
		this.statePart = new byte[size];
 	}

 	public byte getState() {
 		for (int i = 0; i < statePart.length; i++) {
 			if (statePart[i] == 1) return 1;
  			if (statePart[i] == 2) return 2;
 		}
 		return 0;
 	}

 	public byte[] getStatePart() {
 		return statePart;
 	}

 	public byte getxStart() {
 		return xStart;
 	}

 	public byte getyStart() {
 		return yStart;
 	}

 	public byte getxEnd() {
 		return xEnd;
 	}

 	public byte getyEnd() {
 		return yEnd;
 	}

	public byte getSize() {
		return size;
	}

	public void setState(byte state) { // меняем состояние всех палуб сразу на состояние state
		for (int i = 0; i < statePart.length; i++) {
			statePart[i] = state;
		}
	}

	public void setStateInjured(byte x, byte y) { // меняем состояние клетки внутри корабля на "ранен"
		int index;

		if (xStart == xEnd) {
			 index = y - yStart;
		} else {
			 index = x - xStart;
		}
		statePart[index] = 1;
	}
}