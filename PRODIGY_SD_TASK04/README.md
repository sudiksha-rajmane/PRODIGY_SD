# PRODIGY_SD_TASK04 – Sudoku Solver

## 📌 Overview

This project is a Java-based **Sudoku Solver** developed as part of my Software Development Internship at **Prodigy InfoTech**.

The program takes an unsolved 9×9 Sudoku puzzle as input and solves it automatically using the **Backtracking Algorithm**.

Users enter `0` for empty cells, and the program displays both the original and solved Sudoku puzzle.

## 🚀 Features

- Accepts a 9×9 Sudoku puzzle as input
- Uses `0` to represent empty cells
- Validates numbers according to Sudoku rules
- Checks rows, columns, and 3×3 boxes
- Solves the puzzle using backtracking
- Displays the original Sudoku
- Displays the solved Sudoku
- Detects puzzles with no possible solution
- Simple console-based interface

## 🧠 Algorithm Used

### Backtracking Algorithm

The Sudoku solver uses a recursive **backtracking technique**.

The algorithm:

1. Finds an empty cell.
2. Tries numbers from 1 to 9.
3. Checks whether the number is valid.
4. Places the number if it is valid.
5. Recursively continues solving the puzzle.
6. If the selected number leads to an invalid solution, it removes the number.
7. The algorithm then tries another number.
8. This process continues until the Sudoku is solved.

## 🛠️ Technologies Used

- Java
- Recursion
- Backtracking Algorithm
- Two-dimensional Arrays
- Scanner
- Conditional Statements
- Loops
- Methods

## 📂 Project Structure

```text
PRODIGY_SD_TASK04/
│
├── SudokuSolver.java
└── README.md
