package player;

import game.Case;
import game.Color;
import game.Piece;

import java.util.HashMap;
import java.util.Map;

public abstract class Player {
    private final Color color;
    private final Map<Case, Piece> pieces;

    public Player(Color color) {
        this.color = color;
        this.pieces = new HashMap<Case, Piece>();
    }

    public Color getColor() {
        return this.color;
    }
}
