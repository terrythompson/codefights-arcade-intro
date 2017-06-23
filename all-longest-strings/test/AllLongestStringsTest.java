package test;

import main.AllLongestStrings;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class AllLongestStringsTest {

	@Test
	public void shouldAddSameLengthStringsToArrayList() {
		String[] inputArray = { "abc", "cde", "efg" };
		String[] expected = inputArray;
		String[] result = AllLongestStrings.allLongestStrings(inputArray);
		assertArrayEquals(expected, result);
	}

	@Test
	public void shouldReturnLongestStrings() {
		String[] inputArray = { "abc", "efgh", "fghi", "abcdefg", "cba", "tuvwxyz" };
		String[] expected = { "abcdefg", "tuvwxyz" };
		String[] result = AllLongestStrings.allLongestStrings(inputArray);
		assertArrayEquals(expected, result);
	}

}
