package catalin;

import java.io.File;
import java.io.FileNotFoundException;

public class MultiplyMatrix extends Reader {
    public int[][] matrixMultiplication = new int[4][4];
    public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                int a;
                int b = matrix1[i][j];
                int c = matrix2[i][j];
                a = (b * c);
                matrixMultiplication[i][j] = a;
            }
        }
        return matrixMultiplication;
    }
}