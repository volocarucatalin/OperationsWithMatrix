import catalin.Matrix;
import catalin.Reader;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestRead {

    @Test
    public void testReadMatrix() throws IOException {
        int[][] body = {{1, 2, 1}, {3, 4, 1}, {5, 6, 1}};
        Matrix expected = new Matrix(3, 3, body);
        File file = new File("src/test/resources/matrix.txt");
        Matrix matrix = Reader.readMatrix(file);
        Assert.assertEquals(expected, matrix);
    }
}
