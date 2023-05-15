package com.code;

import java.util.Scanner;

public class FactorialNumberProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number :");
		int num = sc.nextInt();
		long factorialNum = getFactorialNum(num);
		System.out.println("For given number "+num +"factorial is = "+factorialNum);
	}

	private static long getFactorialNum(int num) {
		
		int factorial = 1;
		
		for (int i = 1; i <=5; i++) {
			
			factorial = factorial * i;
		}
		return factorial;
	}

}
