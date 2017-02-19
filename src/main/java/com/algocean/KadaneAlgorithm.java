package com.algocean;

import java.util.List;

/*
 * Best performance algorithm to find sum of maximum sub-sequence in an array
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class KadaneAlgorithm {

	public static int findMaximumSubSequenceSum(List<Integer> list){
		
		int maximumSubSequenceSum = Integer.MIN_VALUE;
		int cumulativeSum = 0;
		
		if(list.size() == 0){
			return 0;
		}
		
		for(Integer num: list){
			cumulativeSum += num;
			
			if(maximumSubSequenceSum < cumulativeSum){
				maximumSubSequenceSum = cumulativeSum;						
			}
			
			if(cumulativeSum < 0){
				cumulativeSum = 0;
			}			
		}
		
		return maximumSubSequenceSum;
	}	
}
