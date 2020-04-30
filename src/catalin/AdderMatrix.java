package catalin;

public class AdderMatrix extends Reader{
    public int[][] matrixSum = new int[4][4];
    public int[][] sum(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                int a;
                int b = matrix1[i][j];
                int c = matrix2[i][j];
                a = (b + c);
                matrixSum[i][j] = a;
            }
        }
        return matrixSum;
    }
}
