package timoday.bai12.entiry;

import java.util.Scanner;

public class Matrix {
    private int column;
    private int row;
    private int [][] matrixx = new int [1000][1000];

    public Matrix() {}

    public Matrix(int column, int row, int[][] matrixx) {
        this.column = column;
        this.row = row;
        this.matrixx = matrixx;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getMatrixx() {
        return matrixx;
    }

    public void setMatrixx(int[][] matrixx) {
        this.matrixx = matrixx;
    }

    public void inputMatrix(Scanner scanner) {
        System.out.print("Enter number row: ");
        setRow(scanner.nextInt());

        System.out.print("Enter number column: ");
        setColumn(scanner.nextInt());

        System.out.println("Enter matrix: ");
        int [][] tem = new int[1000][1000];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                tem[i][j] = scanner.nextInt();
            }
        }
        setMatrixx(tem);
    }

    public Matrix multiply (Matrix newMatrix) {
        int row1 = getRow();
        int row2 = newMatrix.getRow();
        int col1 = getColumn();
        int col2 = newMatrix.getColumn();
        int[][] A = getMatrixx();
        int[][] B = newMatrix.getMatrixx();
        int[][] C = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        return new Matrix(col2, row1, C);
    }

    public Matrix add (Matrix newMatrix) {
        int row1 = getRow();
        int row2 = newMatrix.getRow();
        int col1 = getColumn();
        int col2 = newMatrix.getColumn();
        int[][] A = getMatrixx();
        int[][] B = newMatrix.getMatrixx();
        int[][] C = new int[row1][col2];

        for (int i = 0; i < row1; i++)
            for (int j = 0; j < row2; j++)
                C[i][j] = A[i][j] + B[i][j];

        return new Matrix(col1, row1, C);
    }

    public Matrix subtract (Matrix newMatrix) {
        int row1 = getRow();
        int row2 = newMatrix.getRow();
        int col1 = getColumn();
        int col2 = newMatrix.getColumn();
        int[][] A = getMatrixx();
        int[][] B = newMatrix.getMatrixx();
        int[][] C = new int[row1][col2];

        for (int i = 0; i < row1; i++)
            for (int j = 0; j < row1; j++)
                C[i][j] = A[i][j] - B[i][j];

        return new Matrix(col1, row1, C);
    }
    
    @Override 
    public String toString() {
        String result = "\n";
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                result += matrixx[i][j] + " " ;
            }
            result += "\n";
        }
        return result;
    }
}
