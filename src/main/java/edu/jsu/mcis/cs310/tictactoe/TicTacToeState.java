package edu.jsu.mcis.cs310.tictactoe;

/**
* TicTacToe implements the main class for the Tic-Tac-Toe game.
*
* @author  Rafael Ramos
* @version 1.0
*/

public enum TicTacToeState {
    
    /**
     * The game is over, and X is the winner
     */    
    X("X"),
    
    /**
     * The game is over, and O is the winner
     */
    O("O"),
    
    /**
     * The game has ended in a tie (no winner)
     */
    TIE("TIE"),
    
    /**
     * The game is still in progress (no winner)
     */
    NONE("NONE");

    private String message;

    private TicTacToeState(String msg) {
        message = msg;
    }

    @Override
    public String toString() {
        return message;
    }
    
}