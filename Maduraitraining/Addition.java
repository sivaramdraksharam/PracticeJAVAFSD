package com.mycompany.arith;

public class Addition {

	public static void main(String[] args) 
	{

		// declare variables
		int a, b, c;
		// store integer value in a
		a = Integer.parseInt(args[0]);
		// store integer value in b
		b = Integer.parseInt(args[1]);
		// store addition result in c
		c = add(a,b);
		// show the sum as output
		System.out.println("Sum:" + c);

	}
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static boolean profit(float sp,float cp)
	{
		if(sp>cp)
				return true;
		else if(sp<cp)
			return false;
		else
			return false;
	}

}
