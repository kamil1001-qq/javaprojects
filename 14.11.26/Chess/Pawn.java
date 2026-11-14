public class Pawn extends Figure {
    public Pawn(int column, int row, String color) {
        super(column, row, color);
    }

    @Override // это контролирует сигнатуру переопределяемого метода
    public boolean checkPosition(int column, int row) {

        if (this.color.equals("white")) {
            if (this.column == column && this.row + 1 == row) return true;
            if (this.column == column && this.row == 1 && row == 3) return true;
            if ((this.column + 1 == column || this.column - 1 == column) &&
                    (this.row + 1 == row)) return true;
        } else {
            if (this.column == column && this.row - 1 == row) return true;
            if (this.column == column && this.row == 6 && row == 4) return true;
            if ((this.column + 1 == column || this.column - 1 == column) &&
                    (this.row - 1 == row)) return true;
        }

        return false;
    }

    @Override
    public String getPresent() {
        return color.equals("white") ? String.valueOf('\u2659') : String.valueOf('\u265f');
    }
}