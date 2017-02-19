package com.algocean.sorting;

import java.util.List;

/**
 * One of the simple sorting algorithms.
 * 
 * Starting from the first element creates a in-place sub-array. Puts each
 * subsequent element in its sorted position in sub-array. At any time sub-array
 * is sorted.
 * 
 * Properties : In-place, Stable.
 * 
 * Time complexity: O(n^2) Space complexity: O(1);
 *
 */
public class InsertionSort implements Sorter {

	@Override
	public List<Integer> sort(List<Integer> list) {

		// starting from second element
		for (int i = 1; i < list.size(); i++) {
			int position = i - 1;

			// insertion position
			int valueToBeInserted = list.get(i);

			// move it till the left till its sorted position
			while (position >= 0 && valueToBeInserted < list.get(position)) {
				list.set(position + 1, list.get(position));
				position--;
			}

			list.set(position + 1, valueToBeInserted);
		}

		return list;
	}
}
