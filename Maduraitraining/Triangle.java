package com.mycompany.abstractclasses;

public class Triangle extends Shape{
	private float breadth;
    private float height;
	private float area;	
	
	//generate getters and setters

    public float getBreadth() {
		return breadth;
	}

	public float getHeight() {
		return height;
	}

	public float getArea() {
		return area;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setArea(float area) {
		this.area = area;
	}

	
		public void calcArea()
		{
			area=0.5f*breadth*height;
		}
		
		public void printArea()
		{
			System.out.println("Area of triangle:"+area);
			
		}
	
}
