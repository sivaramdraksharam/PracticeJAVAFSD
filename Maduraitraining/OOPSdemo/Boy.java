package com.mycompany.recapjava;
//bean
public class Boy extends Student {
	private String gender;
	
	public Boy()
	{
		gender="Male";
	}
	//overload Boy constructor
	public Boy(String name)
	{
		this.name=name;
	}
	
	public Boy(int n,String name)
	{
		
	}
	public Boy(String nickname,String name)
	{
		
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	

}
