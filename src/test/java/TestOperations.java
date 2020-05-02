import catalin.Matrix;
import catalin.Reader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestOperations {
    private Matrix matrix;
    private Matrix matrix1;
    private Matrix matrix2;

    @Before
    public void init() throws IOException {
        matrix = Reader.readMatrix(new File("src/test/resources/matrix.txt"));
        matrix1 = Reader.readMatrix(new File("src/test/resources/matrix1.txt"));
        matrix2 = Reader.readMatrix(new File("src/test/resources/matrix2.txt"));
    }

    @Test
    public void testSumMatrix() throws Exception {
        int[][] body = {{2, 4, 2}, {6, 8, 2}, {10, 12, 2}};
        Matrix expected = new Matrix(3, 3, body);
        Assert.assertEquals(expected, matrix.sum(matrix1));
    }

    @Test(expected = Exception.class)
    public void testSumMatrixWrongCase() throws Exception {
        matrix.sum(matrix2);
    }

    @Test
    public void testMultiplicationMatrix() throws Exception {
        int[][] body = {{12, 16, 4}, {20, 28, 8}, {28, 40, 12}};
        Matrix expected = new Matrix(3, 3, body);
        Assert.assertEquals(expected, matrix.multiplication(matrix1));
    }

    @Test
    public void testMultiplicationMatrixWithDifferentSize() throws Exception {
        int[][] body = {{4, 4}, {8, 8}, {12, 12}};
        Matrix expected = new Matrix(3, 2, body);
        Assert.assertEquals(expected, matrix.multiplication(matrix2));
    }

    @Test(expected = Exception.class)
    public void testMultiplicationMatrixWrongCase() throws Exception {
        matrix2.multiplication(matrix);
    }

}
