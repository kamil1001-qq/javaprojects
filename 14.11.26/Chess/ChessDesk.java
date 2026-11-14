public class ChessDesk {
    private Figure[][] desk = new Figure[8][8];

    public ChessDesk() {
        createDesk();
        show();
    }

    // расставляем фигуры
    public void createDesk() {
        Pawn pawn = new Pawn(0, 1, "Black");
        desk[1][0] = pawn;

    }

    // получаем фигуру по позиции
    /**
     * column 'A' - 'H', 'a' - 'h'
     * row 1 - 8
     */
    public Figure getFigure(char column, int row) {
        int c = switch (column) {
            case 'a', 'A' -> 0;
            case 'b', 'B' -> 1;
            case 'c', 'C' -> 2;
            case 'd', 'D' -> 3;
            case 'e', 'E' -> 4;
            case 'f', 'F' -> 5;
            case 'g', 'G' -> 6;
            case 'h', 'H' -> 7;
            default -> -1;
        };

        int r = row - 1;
        return desk[r][c];
    }

    public void show() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j <= 7; j++) {
                String c = desk[i][j] == null ? "_" : desk[i][j].getPresent();
                System.out.print(c);
            }
            System.out.println();
        }
    }
}