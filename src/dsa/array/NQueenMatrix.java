package dsa.array;

import java.util.Arrays;

public class NQueenMatrix {
    int[][] matrix;

    public NQueenMatrix(int n) {
        matrix = new int[n][n];
    }

    public static void main(String[] args) {
        NQueenMatrix nQueenMatrix = new NQueenMatrix(4);
//        nQueenMatrix.addDummyData();
//        nQueenMatrix.printMatrix();
//        nQueenMatrix.printForRow(1);
//        nQueenMatrix.printForCol(2);
        nQueenMatrix.placeQueens(0);
        nQueenMatrix.printMatrix();
    }

    private void addDummyData() {
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
    }

    private void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ->");
            }
            System.out.println();
        }
    }

    private void printForRow(int row) {
        System.out.println("Printing Row:");
        System.out.print(row + " -> ");
        for (int i = 0; i < matrix[row].length; i++) {
            System.out.print(matrix[row][i] + " ->");
        }
    }

    private void printForCol(int col) {
        System.out.println("Printing Col:");
        System.out.print(col + " -> ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][col] + " ->");
        }
    }

    boolean checkInRow(int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] == 1) return false;
        }
        return true;
    }

    boolean checkInCol(int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] == 1) return false;
        }
        return true;
    }

    boolean checkForDiagonalIncreasing(int row, int col) {
        for (int i = row; i < matrix.length; i++) {
            for (int j = col; j < matrix[row].length; j++) {
                if (matrix[i][j] == 1) return false;
            }
        }
        return true;
    }

    boolean checkForDiagonalDecreasing(int row, int col) {
        for (int i = row; i >= 0; i--) {
            for (int j = col; j >= 0; j--) {
                if (matrix[i][j] == 1) return false;
            }
        }
        return true;
    }

    boolean checkForDiagonalPosNeg(int row, int col) {
        while ((row < matrix.length && col >= 0)) {
            if (matrix[row][col] == 1) return false;
            row++;
            col--;
        }
        return true;
    }

    boolean isSafe(int row, int col) {
        return (
                checkInRow(row) &&
                        checkInCol(col) &&
                        checkForDiagonalIncreasing(row, col) &&
                        checkForDiagonalDecreasing(row, col) &&
                        checkForDiagonalPosNeg(row, col) &&
                        checkForDiagonalPosNeg(col, row));
    }

    boolean placeQueens(int row) {
        System.out.println("Row: " + row + " Matrix: " + Arrays.toString(matrix[row]));
        if (row == matrix.length - 1) return true;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (isSafe(row, i)) {
                matrix[row][i] = 1;
                if (placeQueens(row + 1))
                    return true;
                matrix[row][i] = 0;
            }
        }
        return false;
    }
}
