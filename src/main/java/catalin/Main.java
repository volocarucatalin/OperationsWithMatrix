package catalin;

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {

        try {
            Matrix matrix1 = Reader.readMatrix(new File(args[1]));
            Matrix matrix2 = Reader.readMatrix(new File(args[2]));
            if ("SUM".equals(args[0])) {
                Writer.writeMatrix(new File("out.txt"), matrix1.sum(matrix2));

            } else if ("MULTY".equals(args[0])) {
                Writer.writeMatrix(new File("out.txt"), matrix1.multiplication(matrix2));
            } else {
                System.out.println("Operation unknown! " + "\nPlease use SUM or MULTY as operation.");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }
}



