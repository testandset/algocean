package com.algocean.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class InsertionSortTest {	

	@Parameters
	public static Collection<Object[]> testData(){
		return Arrays.asList(new Object[][]{
			{Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1)},
			{Arrays.asList(20, 35, 99), Arrays.asList(35, 99, 20)},
			{Arrays.asList(2, 2, 2), Arrays.asList(2, 2, 2)},
			{Arrays.asList(-1, 2, 2, 5, 7, 9, 10), Arrays.asList(10, 2, 5, 7, 9, 2, -1)}
		});
	}
	
	@Parameter
	public List<Integer> result;
	
	@Parameter(1)
	public List<Integer> arrayToTest;
	
	@Test
	public void testTrivialList() {		
		Sorter insertionSort = new InsertionSort();
		assertEquals(result, insertionSort.sort(arrayToTest));
	}
}
