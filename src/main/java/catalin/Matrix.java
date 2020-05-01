package catalin;

public class Matrix implements Operations {
    public int lines;
    public int columns;
    public int[][] body;

    public Matrix(int lines, int columns, int[][] body) {
        this.body = body;
    }

    public Matrix multiplication(Matrix matrix) {
        int[][] matrixMultiplication = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrixMultiplication[i][j] = matrix.body[i][j] + body[i][j];
            }

        }
        return new Matrix(lines,columns,matrixMultiplication);
    }

    public Matrix sum(Matrix matrix) {
        int[][] matrixSum = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrixSum[i][j] =  matrix.body[i][j] + body[i][j] ;
            }
        }
        return new Matrix(lines , columns , matrixSum);
    }


    public int[][] getBody() {
        return body;
    }
}
