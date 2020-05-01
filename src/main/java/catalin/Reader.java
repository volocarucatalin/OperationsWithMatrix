package catalin;

import java.io.*;
import java.util.regex.MatchResult;

public class Reader {
    File filename;
    int lines;
    int columns;
    int[][] body;

    public Matrix readMatrices(File filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        for (int i = 0; i < lines; i++) {
            String[] value1 = bufferedReader.readLine().split(" ");
            for (int j = 0; j < columns; j++) {
                int valueInteger1 = Integer.parseInt(value1[j]);
                body[i][j] = valueInteger1;
            }
        }
       return new Matrix(lines,columns,body);
    }
}
