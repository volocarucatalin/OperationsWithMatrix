package catalin;

import java.io.*;

public class Reader {
    File file;
    BufferedReader bufferedReader ;

    public Reader( File file) throws FileNotFoundException {
        this.file = file;
        bufferedReader = new BufferedReader(new FileReader(file));
    }

    public Reader() {
    }

    public int[][] readMatrices(int[][] matrix) throws IOException {
        for (int i = 0; i < 4; i++) {
            String[] value1 = bufferedReader.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                int valueInteger1 = Integer.parseInt(value1[j]);
                matrix[i][j] = valueInteger1;
            }
        }
       return matrix;
    }
}
