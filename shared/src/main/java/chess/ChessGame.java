package chess;

import java.util.Collection;
import java.util.Objects;

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

    public TeamColor getTeamTurn() {
        return teamTurn;
    }

    public void setTeamTurn(TeamColor teamTurn) {
        this.teamTurn = teamTurn;
    }

    public ChessBoard getBoard() {
        return board;
    }

    public void setBoard(ChessBoard board) {
        this.board = board;
    }

    public Collection<ChessMove> validMoves(ChessPosition startPosition) {
        System.out.println("validMoves not done yet");
        return null;
    }

    public void makeMove(ChessMove move) throws InvalidMoveException {
        System.out.println("makeMove not done yet");
    }

    public boolean isInCheck(TeamColor teamColor) {
        System.out.println("isInCheck not done yet");
        return false;
    }

    public boolean isInCheckmate(TeamColor teamColor) {
        System.out.println("isInCheckmate not done yet");
        return false;
    }

    public boolean isInStalemate(TeamColor teamColor) {
        System.out.println("isInStalemate not done yet");
        return false;
    }

    private boolean teamHasNoValidMoves(TeamColor teamColor) {
        System.out.println("teamHasNoValidMoves not done yet");
        return false;
    }

    private boolean isInCheckOnBoard(ChessBoard currentBoard, TeamColor teamColor) {
        System.out.println("isInCheckOnBoard not done yet");
        return false;
    }

    private ChessPosition findKing(ChessBoard currentBoard, TeamColor teamColor) {
        System.out.println("findKing not done yet");
        return null;
    }

    private void makeMoveOnBoard(ChessBoard currentBoard, ChessMove move) {
        System.out.println("makeMoveOnBoard not done yet");
    }

    private ChessBoard copyBoard(ChessBoard original) {
        System.out.println("copyBoard not done yet");
        return new ChessBoard();
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals not done yet");

        if (!(o instanceof ChessGame)) {
            return false;
        }

        ChessGame other = (ChessGame) o;

        return teamTurn == other.teamTurn &&
                Objects.equals(board, other.board);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode not done yet");
        return Objects.hash(teamTurn, board);
    }
}