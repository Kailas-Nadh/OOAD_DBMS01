package com.question1.entity;

import java.util.Scanner;

import com.question1.utility.SumArray;

public class SumOfElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("How many numbers do you want to add:");
		n = scanner.nextInt();
		int listNumber [] = new int [n];
		System.out.println("Enter the numbers:");
		
		for(int index=0;index<n;index++) {
			listNumber[index] = scanner.nextInt();
		}
		
		SumArray sumArray = new SumArray ();
		int sumOfNumbers = sumArray.findSumOfAllElements(listNumber,n);
		System.out.println("Sum: " + sumOfNumbers);
		
		

	}

}
