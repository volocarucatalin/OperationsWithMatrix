package catalin;

import java.io.*;


public class Reader {


    public static Matrix readMatrix(File filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String[] firstLine = bufferedReader.readLine().split(" ");

        int lines = Integer.valueOf(firstLine[0]);
        int columns = Integer.valueOf(firstLine[1]);

        int[][] body = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            String[] value1 = bufferedReader.readLine().split(" ");
            for (int j = 0; j < columns; j++) {
                int valueInteger1 = Integer.parseInt(value1[j]);
                body[i][j] = valueInteger1;
            }
        }
        return new Matrix(lines, columns, body);
    }
}
