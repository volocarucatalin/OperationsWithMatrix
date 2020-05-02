package catalin;

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        File fileMatrix1 = new File("C:\\Users\\voloc\\OneDrive\\Desktop\\matrice1.TXT");
        File fileMatrix2 = new File("C:\\Users\\voloc\\OneDrive\\Desktop\\matrice1.TXT");
        File fileWrite = new File("C:\\Users\\voloc\\OneDrive\\Desktop\\fileToWrite.TXT");
        Matrix matrix1 = Reader.readMatrix(fileMatrix1);
        Matrix matrix2 = Reader.readMatrix(fileMatrix2);
        Writer.writeMatrix(fileWrite, matrix1.multiplication(matrix2));

        Writer.writeMatrix(fileWrite,matrix1.sum(matrix2));
    }
}



