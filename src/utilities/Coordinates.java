package utilities;

public final class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return ("a" + this.x) + (8 - this.y);
    }
}
