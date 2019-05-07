package ua.lviv.iot;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringProcessorTest {
    StringProcessor manager = new StringProcessor();
    String testString;
    List<String> expected;
    List<String> actual;

    @BeforeEach
    public final void setUp() {
        expected = new LinkedList<String>();
        actual = new LinkedList<String>();

        testString = "logo123dsfs, logoapple123, logo12312banana, logo2131cookie, logo123americans,"
                + " logo21312something, logo31231careless, logo123cup, logo32132taste, "
                + "logo123share, logo123221gotIt, object, match, piece, little, slow, fast, come.";

        expected.add("logo123cup");
        expected.add("logo123americans");
        expected.add("logo12312banana");
        expected.add("logo123dsfs");
        expected.add("logo123share");
        expected.add("logo123221gotIt");

        manager.setUserInput(testString);
    }

   @Test
    public final void testFindMatch() throws IOException {
        actual = manager.fileNameFinder();
      Assertions.assertEquals(6, actual.size());
        manager.showResults();
    }

}