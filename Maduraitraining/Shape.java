package com.mycompany.abstractclasses;

public abstract class Shape {

	// class instance variable
	public String shapeName;

	// abstract method do not have body means block of code
	public abstract void calcArea();

	//we can define a method or method(s) inside abstract class
	public void showShape() {

		System.out.println("Shape name:" + shapeName);
	}

}
