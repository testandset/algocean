package com.algocean.sorting;

import java.util.List;

/**
 * Efficient, general purpose divide and conquer sorting algorithm.
 * 
 * Pick a random pivot and arrange the list so that all elements less than the
 * pivot are on left and all element bigger than pivot are on right. Recursively
 * sort left and right parts.
 * 
 * Properties: Unstable, Recursive
 * 
 * Time complexity: O(nlogn) 
 * Space complexity: O(1);
 */

public class QuickSort implements Sorter {

	@Override
	public List<Integer> sort(List<Integer> list) {

		quickSortBetweenIndexes(list, 0, list.size() - 1);

		return list;
	}

	private void quickSortBetweenIndexes(List<Integer> list, int start, int end) {
		int pivotIndex;

		if (start >= end) {
			return;
		}

		pivotIndex = partition(list, start, end);
		quickSortBetweenIndexes(list, start, pivotIndex - 1);
		quickSortBetweenIndexes(list, pivotIndex + 1, end);
	}

	private int partition(List<Integer> list, int start, int end) {
		int randomizedIndexToPivot = (int) (Math.random() * (end - start) + start);
		int pivotElement = list.get(randomizedIndexToPivot);
		int pivotIndex = start;

		swap(list, randomizedIndexToPivot, end);

		for (int i = start; i <= end - 1; i++) {
			if (list.get(i) < pivotElement) {
				swap(list, i, pivotIndex);
				pivotIndex++;
			}
		}

		swap(list, pivotIndex, end);

		return pivotIndex;
	}

	private void swap(List<Integer> list, int index, int with) {
		int temp = list.get(index);
		list.set(index, list.get(with));
		list.set(with, temp);
	}
}
