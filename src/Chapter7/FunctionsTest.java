package Chapter7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionsTest {

    @Test
    public void testAdd() {
        assertEquals(8, Functions.add.apply(5).apply(3));
        assertEquals(0, Functions.add.apply(0).apply(0));
        assertEquals(-5, Functions.add.apply(-3).apply(-2));
    }

    @Test
    public void testMatches() {
        assertTrue(Functions.matches.apply("\\d+").apply("12345"));
        assertFalse(Functions.matches.apply("\\d+").apply("abc123"));
        assertTrue(Functions.matches.apply("[a-zA-Z]+").apply("hello"));
        assertFalse(Functions.matches.apply("[a-zA-Z]+").apply("hello123"));
    }

    @Test
    public void testSplit() {
        String[] result = Functions.split.apply(",").apply("apple,banana,cherry");
        assertArrayEquals(new String[]{"apple", "banana", "cherry"}, result);

        result = Functions.split.apply("\\s+").apply("one two   three");
        assertArrayEquals(new String[]{"one", "two", "three"}, result);

        result = Functions.split.apply(";").apply("a;b;c");
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }
}
