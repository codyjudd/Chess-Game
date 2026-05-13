package chess;

import java.util.ArrayList;
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

    public void setBoard(ChessBoard board) {
        this.board = board;
    }

    public ChessBoard getBoard() {
        return board;
    }


    // VALID MOVES


    public Collection<ChessMove> validMoves(ChessPosition startPosition) {

        // Get the piece from  the board

        ChessPiece piece = board.getPiece(startPosition);

        // No piece there

        if (piece == null) {

            return null;

        }

        // Get all the possible piece moves

        Collection<ChessMove> possibleMoves =

                piece.pieceMoves(board, startPosition);

        // Store only legal moves

        Collection<ChessMove> validMoves =

                new ArrayList<>();

        // Test every move

        for (ChessMove move : possibleMoves) {

            // Copy board

            ChessBoard copy = copyBoard(board); // will do this later

            // Try move on copied board

            makeMoveOnBoard(copy, move); // same will aslo do this later

            // If king is safe, move is legal

            if (!isInCheckOnBoard(copy,piece.getTeamColor())) {

                validMoves.add(move);

            }

        }

        return validMoves;
    }

    public boolean isInCheck(TeamColor teamColor) {

        return isInCheckOnBoard(board, teamColor); // will do this later

    }

}



