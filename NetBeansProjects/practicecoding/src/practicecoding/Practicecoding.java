import javax.swing.JOptionPane;

public class TicTacToe {

    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static final char EMPTY = ' ';
    private static final char X = 'X';
    private static final char O = 'O';

    private char[][] board = new char[ROWS][COLS];
    private char currentPlayer;

    public TicTacToe() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY;
            }
        }
        currentPlayer = X;
    }

    public void play() {
        boolean isDraw = false;
        boolean hasWinner = false;
        while (!isDraw && !hasWinner) {
            displayBoard();
            String inputRow = JOptionPane.showInputDialog("Player " + currentPlayer + ", enter row (0-2):");
            String inputCol = JOptionPane.showInputDialog("Player " + currentPlayer + ", enter column (0-2):");
            int row = Integer.parseInt(inputRow);
            int col = Integer.parseInt(inputCol);
            if (board[row][col] != EMPTY) {
                JOptionPane.showMessageDialog(null, "Invalid move, try again.");
            } else {
                board[row][col] = currentPlayer;
                if (isWinningMove(row, col)) {
                    displayBoard();
                    JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
                    hasWinner = true;
                } else if (isBoardFull()) {
                    displayBoard();
                    JOptionPane.showMessageDialog(null, "It's a draw!");
                    isDraw = true;
                } else {
                    currentPlayer = (currentPlayer == X) ? O : X;
                }
            }
        }
    }

    private void displayBoard() {
        String boardStr = "";
        for (int i = 0; i < ROWS; i++) {
            boardStr += "-------------\n";
            for (int j = 0; j < COLS; j++) {
                boardStr += "| " + board[i][j] + " ";
            }
            boardStr += "|\n";
        }
        boardStr += "-------------\n";
        JOptionPane.showMessageDialog(null, boardStr);
    }

    private boolean isWinningMove(int row, int col) {
        return (board[row][0] == currentPlayer         // 3-in-a-row horizontally
                && board[row][1] == currentPlayer
                && board[row][2] == currentPlayer
            || board[0][col] == currentPlayer      // 3-in-a-row vertically
                && board[1][col] == currentPlayer
                && board[2][col] == currentPlayer
            || row == col && board[0][0] == currentPlayer  // 3-in-a-row diagonally
                && board[1][1] == currentPlayer
                && board[2][2] == currentPlayer
            || row + col == 2 && board[0][2] == currentPlayer
                && board[1][1] == currentPlayer
                && board[2][0] == currentPlayer);
    }

    private boolean isBoardFull() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
   