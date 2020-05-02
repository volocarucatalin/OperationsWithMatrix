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


    public Matrix multiplication(Matrix matrix) throws Exception {
        if (columns != matrix.getLines()) {
            throw new Exception("This matrices can't be multiplied");
        }
        int[][] result = new int[lines][matrix.getColumns()];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                result[i][j] = 0;
                for (int k = 0; k < columns; k++) {
                    result[i][j] = result[i][j] + body[i][k] * matrix.body[k][j];
                }
            }

        }
        return new Matrix(lines, matrix.getColumns(), result);
    }

    public Matrix sum(Matrix matrix) throws Exception {
        if (columns != matrix.getColumns() || lines != matrix.getLines()) {
            throw new Exception("This matrices can't be sum");
        }
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

    public int getLines() {
        return lines;
    }

    public int getColumns() {
        return columns;
    }
}
