package catalin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeMatrix(File fileName, Matrix matrix) {
        try {

            FileWriter bufferedWriter = new FileWriter(fileName.getAbsoluteFile(), true);

            bufferedWriter.write(matrix.getLines() + " " + matrix.getColumns());
            bufferedWriter.write("\n");

            for (int i = 0; i < matrix.getColumns(); i++) {
                for (int j = 0; j < matrix.getLines(); j++) {
                    bufferedWriter.write(matrix.getBody()[i][j] + " ");
                }
                bufferedWriter.write("\n");
                bufferedWriter.flush();

            }

            bufferedWriter.write("\n");
            bufferedWriter.flush();


        } catch (IOException ignored) {
            ignored.printStackTrace();
        }
    }

}
