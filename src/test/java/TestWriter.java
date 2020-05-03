import catalin.Matrix;
import catalin.Reader;
import catalin.Writer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class TestWriter {

    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    @Test
    public void testWriteInfile() throws IOException {

        File file = new File("src/test/resources/matrix.txt");
        File file1 =folder.newFile("matrix_temp.txt");
        Matrix expected = Reader.readMatrix(file);
        Writer.writeMatrix(file1,expected);
        Matrix matrix = Reader.readMatrix(file1);
        Assert.assertEquals(expected, matrix);

    }

}
