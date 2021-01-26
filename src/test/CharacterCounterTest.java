import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CharacterCounterTest {

    CharacterCounter characterCounterTest = new CharacterCounter();

    @Test
    public void outResultTest() {
        assertEquals("\" \" - 3\n" +
                        "\"0\" - 2\n" +
                        "\"1\" - 1\n" +
                        "\"!\" - 3\n" +
                        "\"e\" - 1\n" +
                        "\"U\" - 1\n" +
                        "\"H\" - 1\n" +
                        "\"K\" - 1\n" +
                        "\"l\" - 2\n" +
                        "\"o\" - 1",
                characterCounterTest.outResult("Hello KU100 !! !"));
    }

    @Test
    public void result_AssertEquals_IfInputIsNull() {
        assertEquals("Input is null, please input no null string", characterCounterTest.outResult(null));
    }

    @Test
    public void result_AssertEquals_IfInputIsEmpty() {
        assertEquals("", characterCounterTest.outResult(""));
    }
}