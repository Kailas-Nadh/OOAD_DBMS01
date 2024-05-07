package com.ilp03.utility;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numberList [] = new int [5];
		System.out.println("Enter four numbers:");
		numberList[0] = scanner.nextInt();
		numberList[1] = scanner.nextInt();
		numberList[2] = scanner.nextInt();
		numberList[3] = scanner.nextInt();
		System.out.println("The entered numbers are: ");
		System.out.println(numberList[0]);
		System.out.println(numberList[1]);
		System.out.println(numberList[2]);
		System.out.println(numberList[3]);		
		
		

	}

}
