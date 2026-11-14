public abstract class Figure { // abstract - запрещает new Figure, можно использовать только чтобы наследовать
    protected int row;
    protected int column;

    /** */
    protected String color;

    public Figure(int column, int row, String color) {
        this.column = column;
        this.row = row;
        this.color = color.toLowerCase();
    }

    public String getPosition() {
        return (char) (column + 'A') + String.valueOf(row + 1);
    }

    public abstract boolean checkPosition(int column, int row); // будем переопределять

    public void setPosition(int column, int row) {
        if (checkPosition(column, row)) {
            this.column = column;
            this.row = row;
        }
    }

    public abstract String getPresent(); // представление фигуры в виде символа
}