import catalin.Matrix;
import catalin.Reader;
import catalin.Writer;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestWriter {

    @Test
    public void testWriteInfile() throws IOException {

        File file = new File("src/test/resources/matrix.txt");
        File file1 = new File("src/test/resources/file_to_write.txt");
        Matrix expected = Reader.readMatrix(file);
        Writer.writeMatrix(file1,expected);
        Matrix matrix = Reader.readMatrix(file1);
        Assert.assertEquals(expected, matrix);

    }

}
