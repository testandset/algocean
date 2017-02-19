package com.algocean;

/**
 * A function of two parameters that grows very fast, really fast.
 *
 */
public class AckermannFunction {

	
	/**
	 * A simple example of an Ackermann function
	 * 	compute(0, j)= j+1	for j ≥ 0
	 *  compute(i, 0)= compute(i-1, 1)	for i > 0
	 * 	compute(i, j)= compute(i-1, compute(i, j-1))	for i, j > 0
	 * 
	 * @param i
	 * @param j
	 */
	public static int compute(int i, int j){
		
		if(i > 0 && j == 0){
			return compute(i-1, 1);
		}
		
		if(i == 0 && j >= 0){
			return j+1;
		}
		
		return compute(i -1 , compute(i, j-1));
	}
	
	public static void main(String[] args) {
		
		System.out.println(AckermannFunction.compute(0, 0)); //1
		System.out.println(AckermannFunction.compute(3, 3)); //61
		System.out.println(AckermannFunction.compute(4,  4)); //Stack overflow
	}

}
