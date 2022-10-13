import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;


import java.util.List;
import java.util.ArrayList;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> s1 = new ArrayList<>();
        s1.add("hey");
        s1.add("pedantic");
        s1.add("fantastic");
        List<String> expected = new ArrayList<>();
        expected.add("pedantic");
        expected.add("fantastic");
        List<String> result = ListExamples.filter(s1, new LongWordChecker());
        assertArrayEquals(expected.toArray(), result.toArray());
    }
    @Test
    public void testMerge1() {
        List<String> s1 = new ArrayList<>();
        s1.add("a");
        s1.add("b");
        s1.add("d");
        s1.add("m");

        List<String> s2 = new ArrayList<>();
        s2.add("c");
        s2.add("f");

        List<String> result = ListExamples.merge(s1, s2);

        String[] expected = {"a", "b", "c", "d", "f", "m"};
        assertArrayEquals(expected, result.toArray());
    }
}

