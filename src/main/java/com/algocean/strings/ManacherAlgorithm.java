package com.algocean.strings;

public class ManacherAlgorithm {
	

	private int[] subStringPalindromeLengthList;
	
	private String input;
	
	public ManacherAlgorithm(String str){
		input = str;
		subStringPalindromeLengthList = new int[2*input.length() + 1];
	}	
	
	public String findLongestPalindromeSubstring(){
		
		int centerOfCurrentPalindrome = 0, 
			rightEdgeOfCurrentPalindrome = 0,
			maxLenghOfPalindrome = 0,
			centerOfMaxLengthPalindrome = 0;
		
		for(int i = 1; i < subStringPalindromeLengthList.length; i++){
			int mirror = 2*centerOfCurrentPalindrome - i;
			
			if(i < rightEdgeOfCurrentPalindrome){
				subStringPalindromeLengthList[i] = Math.min(subStringPalindromeLengthList[mirror], rightEdgeOfCurrentPalindrome - i);
			}
			
			while(indexWithinBounds(i) && (isOdd(i) || doesPalindromeExpandsAt(i))){
				subStringPalindromeLengthList[i]++;
			}
			
			if(maxLenghOfPalindrome < subStringPalindromeLengthList[i]){
				maxLenghOfPalindrome = subStringPalindromeLengthList[i];
				centerOfMaxLengthPalindrome = i;
			}
			maxLenghOfPalindrome = Math.max(maxLenghOfPalindrome, subStringPalindromeLengthList[i]);

			if(i + subStringPalindromeLengthList[i] > rightEdgeOfCurrentPalindrome){
				centerOfCurrentPalindrome = i;
				rightEdgeOfCurrentPalindrome = i + subStringPalindromeLengthList[i];
			}			
		}
		
		int start = (centerOfMaxLengthPalindrome - maxLenghOfPalindrome) / 2;
		int end = start + maxLenghOfPalindrome - 1;
		
		
		return input.substring(start, end + 1); 
	}
	
	private boolean indexWithinBounds(int index){
		return (index + subStringPalindromeLengthList[index] + 1) < subStringPalindromeLengthList.length &&
				(index - subStringPalindromeLengthList[index]) > 0;
	}
	
	private boolean isOdd(int index){
		return (index + subStringPalindromeLengthList[index] + 1) % 2 == 0;
	}
	
	private boolean doesPalindromeExpandsAt(int index){
		int rightIndexInPalindrome = (index + subStringPalindromeLengthList[index] + 1) / 2;
		int leftIndexInPalindrome = (index - subStringPalindromeLengthList[index] - 1) / 2;
		
		return input.charAt(leftIndexInPalindrome) == input.charAt(rightIndexInPalindrome);
		
	}
}
