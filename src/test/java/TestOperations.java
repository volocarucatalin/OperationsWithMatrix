import catalin.Matrix;
import catalin.Reader;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestOperations {
    
    @Test
    public void testSumMatrix() throws IOException {
        int[][] body = {{2, 4}, {6, 8}, {10, 12}};
        Matrix expected = new Matrix(3, 2, body);
        File file = new File("src/test/resources/matrix.txt");
        File file1 = new File("src/test/resources/matrix1.txt");
        Matrix matrix = Reader.readMatrix(file);
        Matrix matrix1 = Reader.readMatrix(file1);
        Assert.assertEquals(expected, matrix.sum(matrix1));
    }

    @Test
    public void testMultiplicationMatrix() throws IOException {
        int[][] body = {{1, 4}, {9, 16}, {25, 36}};
        Matrix expected = new Matrix(3, 2, body);
        File file = new File("src/test/resources/matrix.txt");
        File file1 = new File("src/test/resources/matrix1.txt");
        Matrix matrix = Reader.readMatrix(file);
        Matrix matrix1 = Reader.readMatrix(file1);
        Assert.assertEquals(expected, matrix.multiplication(matrix1));
    }
}
