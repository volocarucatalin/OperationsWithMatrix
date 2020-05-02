package catalin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeMatrix(File fileName, Matrix matrix) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {


            fileWriter = new FileWriter(fileName.getAbsoluteFile(), true);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(matrix.getColumns() + " " +matrix.getLines());
            bufferedWriter.newLine();

            for (int i = 0; i < matrix.getColumns(); i++) {
                for (int j = 0; j < matrix.getLines(); j++) {
                    bufferedWriter.write(matrix.getBody()[i][j] + " ");
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();

        } catch (IOException ignored) {
            ignored.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();

                if (fileWriter != null)
                    fileWriter.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
    }

}
