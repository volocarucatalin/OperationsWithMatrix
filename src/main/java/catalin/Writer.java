package catalin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeMatrix(File fileName, Matrix matrix) {
        try (FileWriter fileWriter = new FileWriter(fileName.getAbsoluteFile(), true);) {


            fileWriter.write(matrix.getLines() + " " + matrix.getColumns());
            fileWriter.write("\n");

            for (int i = 0; i < matrix.getColumns(); i++) {
                for (int j = 0; j < matrix.getLines(); j++) {
                    fileWriter.write(matrix.getBody()[i][j] + " ");
                }
                fileWriter.write("\n");
                fileWriter.flush();

            }

            fileWriter.write("\n");
            fileWriter.flush();


        } catch (IOException ignored) {
            ignored.printStackTrace();
        }
    }

}
