package com.mycompany.recapjava;

public class Schooldemo {

	public static void main(String[] args) {
		// create school
		Highschool highSchool=new Highschool();
		
		Classroom[] classes=new Classroom[2];
		classes[0]=new Classroom();
		classes[1]=new Classroom();
		
		highSchool.setClassrooms(classes);
		
		Student sivaramstudents[]= {new Boy("Kaver"),new Boy("Syed"),new Girl("Sumana"),new Girl("Aditi")};
		classes[0].setStudents(sivaramstudents);
		String allgames[]= {"Chess","Charrom","Table tennis"};
		String kaverInterests[]= {"Chess","Charrom"};
		String syedInterests[]= {"Charrom"};
		String sumanaInterests[]= {"Chess"};
		String aditiInterests[]= {"Charrom"};
		sivaramstudents[0].setInterests(kaverInterests);
		sivaramstudents[1].setInterests(syedInterests);
		sivaramstudents[2].setInterests(sumanaInterests);
		sivaramstudents[3].setInterests(aditiInterests);
		for(Student s : sivaramstudents)
		{
			System.out.println(s.getName()+" interested in playing");
			if(s instanceof Boy)
			{
				String[] ints=s.getInterests();
				
				for(String i : ints)
				 System.out.println(i);
			
			}else if(s instanceof Girl)
			{

				String[] intr=s.getInterests();
				
				for(String i : intr)
				 System.out.println(i);
			
				s.getInterests();
			}
		}

	}

}
