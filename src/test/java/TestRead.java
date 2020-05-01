import catalin.Matrix;
import catalin.Reader;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestRead {

    @Test
    public void testReadMatrix() throws IOException {
        int[][] body = {{1, 2}, {3, 4}, {5, 6}};
        Matrix expected = new Matrix(3, 2, body);
        File file = new File("src/test/resources/matrix.txt");
        Matrix matrix = Reader.readMatrix(file);
        Assert.assertEquals(expected, matrix);
    }
}
