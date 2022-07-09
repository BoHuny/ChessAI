package game;

import utilities.Coordinates;

import java.util.List;
import java.util.Set;

public abstract class Piece {
    protected final Color color;
    protected PieceName name;
    protected boolean reprocessControlledSquaresEachTurn;
    private Set<Coordinates> controlledSquares;
    private final Chessboard chessboard;
    private boolean hasMoved;

    public Piece(Chessboard chessboard, Color color) {
        this.chessboard = chessboard;
        this.color = color;
        this.hasMoved = false;
    }

    public Color getColor() {
        return this.color;
    }

    public void processControlledSquares(boolean force) {
        if (force || reprocessControlledSquaresEachTurn) {
            this.calculateControlledSquares(this.chessboard);
        }
    }

    protected abstract List<Coordinates> calculateControlledSquares(Chessboard chessboard);
}
