package com.mycompany.arith;
/*
 * Problem: Add two numbers to show their sum
 */

public class Kissadd {

	public static void main(String[] args) {
		Addable grandma = (a,b) ->System.out.println("Sum:"+(a+b));
		grandma.add(5, 2);
		grandma.add(5493, 247);
		
		Multiplyable grandpa = (c,d) ->System.out.println("Product:"+(c*d));
    	grandpa.multiply(4, 3);
		}

}
