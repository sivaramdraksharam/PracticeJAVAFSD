package com.mycompany.abstractclasses;

public class Shapedemo {

	public static void main(String[] args) {
		// create traingle object
		Triangle t=new Triangle();
		
		//set values to the props
		t.setBreadth(2.5f);
		t.setHeight(3.0f);
	    t.shapeName="Triangle";
		t.calcArea();
		
		t.showShape();
		t.printArea();

	}

}
