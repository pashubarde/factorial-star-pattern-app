package com.code;

public class FactorialNumberProgram {

	public static void main(String[] args) {
		
		int num = 5;
		int factorialNum = getFactorialNum(num);
		System.out.println("For given number "+num +"factorial is ="+factorialNum);
	}

	private static int getFactorialNum(int num) {
		
		int factorial = 1;
		
		for (int i = 1; i <=5; i++) {
			
			factorial = factorial * i;
		}
		return factorial;
	}

}
