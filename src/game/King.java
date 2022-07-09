package game;

import utilities.Coordinates;

import java.util.List;

public class King extends Piece {
    public King(Chessboard chessboard, Color color) {
        super(chessboard, color);
        this.reprocessControlledSquaresEachTurn = false;
        this.name = PieceName.KING;
    }

    @Override
    protected List<Coordinates> calculateControlledSquares(Chessboard chessboard) {

        return null;
    }
}
