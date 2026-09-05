package PRODIGY_SD_TASKS;

import java.util.Scanner;

public class SudokuSolver {

    // Display the Sudoku board
    public static void printBoard(int[][] board) {

        System.out.println("\n+-------+-------+-------+");

        for (int row = 0; row < 9; row++) {

            System.out.print("| ");

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[row][col] + " ");
                }

                if ((col + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }

            System.out.println();

            if ((row + 1) % 3 == 0) {
                System.out.println("+-------+-------+-------+");
            }
        }
    }

    // Check whether a number can be placed
    public static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Solve Sudoku using backtracking
    public static boolean solveSudoku(int[][] board) {

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) {

                    for (int num = 1; num <= 9; num++) {

                        if (isSafe(board, row, col, num)) {

                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            // Backtrack
                            board[row][col] = 0;
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] board = new int[9][9];

        System.out.println("=================================");
        System.out.println("         SUDOKU SOLVER");
        System.out.println("=================================");
        System.out.println("Enter the Sudoku puzzle.");
        System.out.println("Use 0 for empty cells.");
        System.out.println();

        // Take Sudoku input
        for (int i = 0; i < 9; i++) {

            System.out.println("Enter row " + (i + 1) + " (9 numbers):");

            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n========== ORIGINAL SUDOKU ==========");
        printBoard(board);

        // Solve the puzzle
        if (solveSudoku(board)) {

            System.out.println("\n========== SOLVED SUDOKU ==========");
            printBoard(board);

        } else {

            System.out.println("\nNo solution exists for this Sudoku puzzle.");
        }

        System.out.println("\n=================================");

        sc.close();
    }
}
