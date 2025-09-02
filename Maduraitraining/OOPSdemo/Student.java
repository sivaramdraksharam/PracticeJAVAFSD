package com.mycompany.recapjava;

//bean
public abstract class Student {
	

	private int rollNumber;
	protected String name;
	private String[] interests;
	
	public Student() {}

	public Student(String name)
	{
		this.name=name;
	}
	public Student(int rollNumber, String name, String[] interests) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.interests = interests;
	}
	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}
	
	
	

}
