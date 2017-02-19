package com.algocean.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class InsertionSortTest {	

	@Test
	public void testTrivialList() {
		List<Integer> list = Arrays.asList(10, 2, 5, 7, 9, 2, -1);
		
		Sorter insertionSort = new InsertionSort();
		
		insertionSort.sort(list);
		
		for(int i = 1; i < list.size(); i++){
			assertTrue(list.get(i - 1) <= list.get(i));
		}	
	}
}
