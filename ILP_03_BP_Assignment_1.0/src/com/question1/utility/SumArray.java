package com.question1.utility;

public class SumArray {
	
	public int findSumOfAllElements (int listNumber [],int limit) {
		int sum=0;
		for(int index=0;index<limit;index++) {
			sum = sum + listNumber[index];
		}
		return sum;
	}

}
