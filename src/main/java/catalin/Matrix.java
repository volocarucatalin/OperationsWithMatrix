package catalin;

import java.util.Arrays;

public class Matrix implements Operations {
    private final int lines;
    private final int columns;
    private final int[][] body;

    public Matrix(int lines, int columns, int[][] body) {
        this.lines = lines;
        this.columns = columns;
        this.body = body;
    }

    public Matrix multiplication(Matrix matrix) {
        int[][] matrixMultiplication = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrixMultiplication[i][j] = matrix.body[i][j] + body[i][j];
            }

        }
        return new Matrix(lines, columns, matrixMultiplication);
    }

    public Matrix sum(Matrix matrix) {
        int[][] matrixSum = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrixSum[i][j] = matrix.body[i][j] + body[i][j];
            }
        }
        return new Matrix(lines, columns, matrixSum);
    }


    public int[][] getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "lines=" + lines +
                ", columns=" + columns +
                ", body=" + Arrays.toString(body) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;
        Matrix matrix = (Matrix) o;
        for (int i = 0; i < lines; i++) {
            if (!Arrays.equals(getBody()[i], matrix.getBody()[i])) {
                return false;
            }
        }

        return lines == matrix.lines &&
                columns == matrix.columns;
    }

}
