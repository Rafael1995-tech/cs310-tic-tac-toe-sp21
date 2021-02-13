package edu.jsu.mcis.cs310.tictactoe;

/**
* TicTacToe implements the main class for the Tic-Tac-Toe game.
*
* @author  Rafael Ramos
* @version 1.0
*/

public enum TicTacToeSquare {
    
    /**
     * X
     */    
    X("X"),
    
    /**
     * O
     */
    O("O"),
    
    /**
     * Empty Square
     */
    EMPTY(" ");

    private String message;

    private TicTacToeSquare(String msg) {
        message = msg;
    }

    @Override
    public String toString() {
        return message;
    }
    
}
