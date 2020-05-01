package catalin;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        File fileMatrix1 = new File("C:\\Users\\voloc\\OneDrive\\Desktop\\matrice1.TXT");
        File fileMatrix2 = new File("C:\\Users\\voloc\\OneDrive\\Desktop\\matrice1.TXT");
        int[][] matrixOne = new int[4][4];
        int[][] matrixTwo = new int[4][4];
        int[][] matrixAddition = new int[4][4];
        int[][] matrixMultiply = new int[4][4];

        Reader file1 = new Reader(fileMatrix1);
        Reader file2 = new Reader(fileMatrix2);
        Matrix operation = new Matrix();
        matrixOne = file1.readMatrices(matrixOne);
        matrixTwo = file2.readMatrices(matrixTwo);

        matrixAddition = operation.sum(matrixOne,matrixTwo);
        matrixMultiply = operation.multiplication(matrixOne,matrixTwo);



    }


}



