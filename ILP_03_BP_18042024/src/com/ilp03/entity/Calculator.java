package com.ilp03.entity;

import java.util.Scanner;

public class Calculator {
	
	public void inputValues() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter first number:");
		double firstNum = scanner.nextDouble();
		System.out.println("Enter second number:");
		double secondNum = scanner.nextDouble();
		Calculator calculator = new Calculator ();
		System.out.println("Sum: " + calculator.addNumber(firstNum,secondNum) + ", Difference: " + calculator.subtractNumber(firstNum,secondNum));

	}
	
	public double addNumber(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
		
		}
	
	public double subtractNumber(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;


	}

}
