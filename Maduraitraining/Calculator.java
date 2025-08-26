package com.mycompany.arith;

public class Calculator {
	static int age=44;
	
	public static void main(String args[])
	{
		//code
		//subtract(5,2);
		System.out.println(age);
		Calculator calc=new Calculator();
		
		int subtractionResult=calc.subtract(5, 1);
		int divisionResult=calc.devide(7, 5);
		System.out.println("Subtraction result:"+subtractionResult);
		System.out.println("Division result:"+divisionResult);
	}
		public int subtract(int a, int b)
		{
			return a-b;
		}
		public int devide(int a, int b)
		{
			return a/b;
		}
		
		
		public double squareRoot(double i)
		{
			return Math.sqrt(i);
		}
	
}
