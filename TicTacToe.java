import java.util.Scanner;

public class TicTacToe {
    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moves = 0;
        boolean gameWon = false;

        while (moves < 9 && !gameWon) {
            printBoard();
            System.out.print("Player " + currentPlayer + ", enter a slot number (1-9): ");
            int slot = sc.nextInt();

            if (slot < 1 || slot > 9 || board[slot-1] == 'X' || board[slot-1] == 'O') {
                System.out.println("Invalid move, try again.");
                continue;
            }

            board[slot-1] = currentPlayer;
            moves++;

            if (checkWinner()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        if (!gameWon) {
            printBoard();
            System.out.println("It's a draw!");
        }
        sc.close();
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    static boolean checkWinner() {
        for (int i = 0; i < 9; i += 3) {
            if (board[i] == board[i+1] && board[i+1] == board[i+2]) return true;
        }
        for (int i = 0; i < 3; i++) {
            if (board[i] == board[i+3] && board[i+3] == board[i+6]) return true;
        }
        
        if (board[0] == board[4] && board[4] == board[8]) return true;
        if (board[2] == board[4] && board[4] == board[6]) return true;

        return false;
    }
}
