package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		System.out.print("Enter the number of elements of the Fibonacci number sequence: ");
		int number = new Scanner(System.in).nextInt();

		if (number <= 0 || number > 46) {
			System.out.println("\nTest in the range of 1 to 46 including");
			return;
		}

		System.out.print("Chose the method of of implementation (loop or recursion): ");
		String method = new Scanner(System.in).nextLine().toLowerCase();

		sequenceOutput(number, method);

	}

	public static void sequenceOutput(int number, String method) {
		System.out.println("\nThe Fibonacci number sequence of " + number + " elements:");

		String separator = (number == 1) ? "" : " | ";

		for (int i = 1; i <= number; i++) {
			if (method.equals("recursion")) {
				System.out.print(fibonacciRecursion(i) + separator);
			} else if (method.equals("loop")) {
				System.out.print(fibonacciLoop(i) + separator);
			} else {
				System.out.println("Error! Unknown method!");
				return;
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	public static int fibonacciRecursion(int number) {

		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
	}

	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		int firstNumber = 1;
		int secondNumber = 1;
		int currentNumber = 1;

		for (int i = 3; i <= number; i++) {
			currentNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = currentNumber;
		}

		return currentNumber;
	}
}
