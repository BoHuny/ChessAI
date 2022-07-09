package game;

import utilities.Coordinates;

public final class Case {
    private final Color color;
    private final Coordinates coordinates;
    private Piece piece;

    public Case(Color color, int x, int y) {
        this.color = color;
        this.coordinates = new Coordinates(x, y);
        this.piece = null;
    }

    public Color getColor() {
        return this.color;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public String toString() {
        return this.coordinates.toString();
    }
}
