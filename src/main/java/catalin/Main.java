package catalin;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        File fileMatrix1 = new File("C:\\Users\\voloc\\OneDrive\\Desktop\\matrice1.TXT");
        File fileMatrix2 = new File("C:\\Users\\voloc\\OneDrive\\Desktop\\matrice1.TXT");

        int[][] matrixAddition = new int[4][4];
        int[][] matrixMultiply = new int[4][4];

        Matrix matrix1 = Reader.readMatrix(fileMatrix1);
        Matrix matrix2 = Reader.readMatrix(fileMatrix2);
        matrixAddition = matrix1.multiplication(matrix2).getBody();
        matrixMultiply = matrix1.sum(matrix2).getBody();


    }


}



