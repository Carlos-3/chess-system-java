package boardgame;

public class Position {

	private int Row;
	private int column;

	public Position(int pow, int column) {
		this.Row = pow;
		this.column = column;
	}

	public int getRow() {
		return Row;
	}

	public void setRow(int pow) {
		this.Row = pow;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public void setValues(int row, int column) {
		this.Row = row;
		this.column = column;
	}

	@Override

	public String toString() {
		return Row + ", " + column;
	}

}
