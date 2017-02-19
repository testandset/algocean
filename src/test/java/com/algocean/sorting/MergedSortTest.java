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
public class MergedSortTest {
	
	@Parameters
	public static Collection<Object[]> mergeTestData() {
		return Arrays.asList(new Object[][]{
			//{sortedArray, splitArraysForMergeTesting, arrayToSort}
			{Arrays.asList(1, 2), Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(2, 1))},
			{Arrays.asList(2, 3), Arrays.asList(Arrays.asList(3), Arrays.asList(2), Arrays.asList(3, 2))},
			{Arrays.asList(2, 3, 4), Arrays.asList(Arrays.asList(3, 4), Arrays.asList(2), Arrays.asList(4, 3, 2))},
			{Arrays.asList(2, 3, 4), Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(3, 4, 2))},
			{Arrays.asList(2, 2, 2), Arrays.asList(Arrays.asList(2, 2), Arrays.asList(2), Arrays.asList(2, 2, 2))}
		});
	}
	
	@Parameter
	public List<Integer> result;
	
	@Parameter(1)
	public List<List<Integer>> lists;

	@Test
	public void testMerge() {
		MergeSort mergeSort = new MergeSort();
		assertEquals(result, mergeSort.merge(lists.get(0), lists.get(1)));
	}
	
	@Test 
	public void mergeSort(){
		MergeSort mergeSort = new MergeSort();
		assertEquals(result, mergeSort.sort(lists.get(2)));
	}

}
