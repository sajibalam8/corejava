package mytest;

import java.util.Arrays;

public class Student {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfSubject() {
		return numberOfSubject;
	}
	public void setNumberOfSubject(int numberOfSubject) {
		this.numberOfSubject = numberOfSubject;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int id;
	public String name;
	public int numberOfSubject;
	public int [] marks;
	
//	[12,'John',2,[22,25]] ,[]

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", numberOfSubject=" + numberOfSubject + ", marks="
				+ Arrays.toString(marks) + "]";
	}

	 Student(int id, String name, int numberOfSubject, int [] marks){
		 
		 
		 this.id=id;
		 this.name=name;
		 this.numberOfSubject=numberOfSubject;
		 this.marks=marks;
	 }
	 
	 public int totalMarks() {
		 
		int sum=0;
		for ( int i=0 ; i<marks.length; i++) {
			
			sum=sum+marks[i];
			
		}
		return sum;
		
	
	
	}
	 
	 
	 public double Average() {
		 	double averageMarks=totalMarks()/marks.length;
			return averageMarks;
			
	 }
}
