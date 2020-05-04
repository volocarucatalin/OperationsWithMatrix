package catalin;

import java.io.*;

import static java.lang.Integer.*;


public class Reader {


    public static Matrix readMatrix(File filename) throws IOException {
        int i = 0;
        int j = 0;
        String[] line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            String[] firstLine = bufferedReader.readLine().split(" ");

            int nrLines = valueOf(firstLine[0]);
            int columns = valueOf(firstLine[1]);


            int[][] body = new int[nrLines][columns];
            for (i = 0; i < nrLines; i++) {
                line = bufferedReader.readLine().split(" ");
                if(line.length != columns){
                    throw new MatrixException("Matrix dose not respect the initial propriety");
                }
                for (j = 0; j < columns; j++) {
                    int element = valueOf(line[j]);
                    body[i][j] = element;
                }
            }
            return new Matrix(nrLines, columns, body);

        } catch (NumberFormatException e) {
            throw new MatrixException("At line " + i + " and column " + j + " is not an integer '" + line[j] + "'");

        } catch (Exception e) {
            throw e;

        }

    }
}
