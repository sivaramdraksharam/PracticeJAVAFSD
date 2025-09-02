package com.mycompany.recapjava;

public class Highschool implements School {

	private Classroom classrooms[];
	
	@Override
	public void cerimony() {
		System.out.println("Independence day celebration");
		
	}

	public Classroom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(Classroom[] classrooms) {
		this.classrooms = classrooms;
	}
	
	

}
