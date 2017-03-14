package com.algocean.strings;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ManacherAlgorithmTest {
	
	@Parameters
	public static Collection<Object[]> testData(){
		return Arrays.asList(new Object[][]{
			{"aba", "aba"},
			{"ababababa", "ababababa"},
			{"abcdefghg", "ghg"},
			{"a", "a"},
			{"", ""},
			{"abababbababb", "bababbabab"}
		});
	}
	
	@Parameter
	public String input;
	
	@Parameter(1)
	public String result;

	@Test
	public void testFindLongestPalindromeSubstring() {
		ManacherAlgorithm manacherAlgo = new ManacherAlgorithm(input);
		assertEquals(manacherAlgo.findLongestPalindromeSubstring(), result);
	}

}
