package acdlab.lt.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IOStreamUtilsTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void redirectOut() {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void givenData_whenYouScanDAtaWhereData_thenAnswerNoData() {
        IOStreamUtils input = new IOStreamUtils();
        input.readFromFile("input.txt");
        Assert.assertEquals("No such file", input);
    }

    @After
    public void cleanUpOut() {
        System.setOut(null);
    }
}
