package com.ilp03.utility;

import java.util.Scanner;

public class ArrayDemoFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numberList [] = new int [5];
		
		System.out.println("Enter four numbers:");
		for(int index=0;index<4;index++) {
			numberList[index]=scanner.nextInt();
		}
		
		System.out.println("The entered numbers are: ");
		for(int index=0;index<4;index++) {
			numberList[index]=scanner.nextInt();
		}
				

	}

}
