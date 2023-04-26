package boardgame;

public class Position {
	
	
	private int row;
	private int column;
	public Position(int pow, int column) {
		this.row = pow;
		this.column = column;
	}
	public int getPow() {
		return row;
	}
	public void setPow(int pow) {
		this.row = pow;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	
	public String toString() {
		return row + ", "+ column;
	}

}
