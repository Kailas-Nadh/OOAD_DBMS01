package com.ilp03.utility;

import java.util.Scanner;

public class ArrayDemoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numberList [] = new int [5];
		System.out.println("Enter four numbers:");
		
		int index=0;
		while(index<4) {
			numberList[index] = scanner.nextInt();
			index++;
		}
		
		System.out.println("The entered numbers are: ");
		index=0;
		while(index<4) {
			System.out.println(numberList[index]);
			index++;
		}
			
		
		

	}

}
