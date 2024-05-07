package com.ilp03.utility;

import java.util.Scanner;

public class ArrayDemoDoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numberList [] = new int [5];
		System.out.println("Enter four numbers:");
		
		int index=0;
		do {
			numberList[index] = scanner.nextInt();
			index++;
		}
		while(index<4);
		
		System.out.println("The entered numbers are: ");
		index=0;
		do {
			System.out.println(numberList[index]);
			index++;
		}
		while(index<4);
		

	}

}
