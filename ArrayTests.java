import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReversInPlaceButBetter() {
    int[] in = {1, 2, 3};
    int[] expected = {3, 2, 1};
    ArrayExamples.reverseInPlace(in);
    assertArrayEquals(expected, in);
  }

  @Test
  public void testReversedButBetter() {
    int[] in = {1, 2, 3};
    int[] expected = {3, 2, 1};
    assertArrayEquals(expected, ArrayExamples.reversed(in));
  }


  @Test
  public void testAvgWithoutLowest() {
    double[] in = {1.0, 3.0, 2.0, 3.0};
    double expected = 2.0;
    double avg = ArrayExamples.averageWithoutLowest(in);
    assertEquals(expected, avg, .001);
  }
}
