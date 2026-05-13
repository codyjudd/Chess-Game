package chess;

public class ChessGame {

    private TeamColor teamTurn;
    private ChessBoard board;

    public enum TeamColor {
        WHITE,
        BLACK
    }

    public ChessGame() {
        board = new ChessBoard();
        board.resetBoard();
        teamTurn = TeamColor.WHITE;
    }
}