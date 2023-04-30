package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. valid values are from a1 to h8");
		}
<<<<<<< HEAD

=======
>>>>>>> 49a4c006481cd94633fdbd5881865fa809ef84b5
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;

	}

	public int getRow() {
		return row;
<<<<<<< HEAD

=======
>>>>>>> 49a4c006481cd94633fdbd5881865fa809ef84b5
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
<<<<<<< HEAD
=======

>>>>>>> 49a4c006481cd94633fdbd5881865fa809ef84b5
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
<<<<<<< HEAD
=======

>>>>>>> 49a4c006481cd94633fdbd5881865fa809ef84b5
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "" + column + row;
	}
}
=======
		return " " + column + row;
	}
}
>>>>>>> 49a4c006481cd94633fdbd5881865fa809ef84b5
