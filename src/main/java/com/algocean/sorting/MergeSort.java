package com.algocean.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Efficient, general purpose divide and conquer sorting algorithm.
 * 
 * Divide the array in half, sort individual halves and merge back.
 * 
 * Properties: Stable, Recursive
 * 
 * Time complexity: O(nlogn)
 * Space complexity: O(n);
 */
public class MergeSort implements Sorter {

	@Override
	public List<Integer> sort(List<Integer> list) {
		
		int listLength = list.size();
		int mid = listLength/2;
		
		if(listLength == 1){
			return list;
		}
		
		return merge(sort(list.subList(0, mid)), sort(list.subList(mid, listLength)));
	}
	
	/**
	 * Merges two sorted lists into an sorted list.
	 * @param firstList
	 * @param secondList
	 * @return
	 */
	protected List<Integer> merge(List<Integer> firstList, List<Integer> secondList){
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		int firstListLength = firstList.size(),
				secondListLength = secondList.size(),
				firstListIterator = 0,
				secondListIterator = 0;
		
		while(firstListIterator < firstListLength && secondListIterator < secondListLength){
			int firstListItem = firstList.get(firstListIterator);
			int secondListItem = secondList.get(secondListIterator);
			
			if(firstListItem < secondListItem){
				mergedList.add(firstList.get(firstListIterator++));
			} else {
				mergedList.add(secondList.get(secondListIterator++));
			}
		}
		
		while(firstListIterator < firstListLength){
			mergedList.add(firstList.get(firstListIterator++));
		}
		
		while(secondListIterator < secondListLength){
			mergedList.add(secondList.get(secondListIterator++));
		}		
		
		return mergedList;
	}

}
