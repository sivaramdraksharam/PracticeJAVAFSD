package com.mycompany.abstractclasses;

public abstract class Food {

	private String foodGrade;
	private String foodType;
	public  boolean isHigenic;
	public Food() {
		super();
	}
	public Food(String foodGrade, String foodType) {
		super();
		this.foodGrade = foodGrade;
		this.foodType = foodType;
	}
	
	
	
}
