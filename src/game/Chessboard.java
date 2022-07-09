package game;

public final class Chessboard {
    private static final int BOARD_DIMENSIONS = 8;

    private final Case[][] board;

    public Chessboard() {
        this.board = getNewBoard();
    }

    private static Case[][] getNewBoard() {
        Case[][] board = new Case[BOARD_DIMENSIONS][BOARD_DIMENSIONS];
        for (int y = 0; y < BOARD_DIMENSIONS; y++) {
            for (int x = 0; x < BOARD_DIMENSIONS; x++) {
                board[y][x] = new Case((x + y) % 2 == 0 ? Color.BLACK : Color.WHITE, x, y);
            }
        }
        return board;
    }
}
