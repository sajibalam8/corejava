package mytest;

import java.util.ArrayList;

public class StudentService {
	public static  ArrayList <Student> StudentRecord =new ArrayList<Student>();
	
	
	
	public  void addStudent(Student student) {
		   
		StudentRecord.add(student);
		
	}
	
	
	public boolean removeStudent(Student student) {
		return StudentRecord.remove(student);
		
		
	}
	
	
	public Student findStudentByName(String name) {
		for ( Student s : StudentRecord) {
			
		  if (s.getName().equals(name)){
			  
			  
			  return s;
		  }
		}
		return null;
		
		
	}
	
	
	
	public Student findStudentById(int id) {
		
		
		for ( Student s : StudentRecord) {
			
			  if (s.getId()==(id)){
				  
				  
				  return s;
			  }
			}
		return null;
		
		

	}
	public  ArrayList <Student> getAllStudents() {
	
		return StudentRecord;
		
	
		
		
		
	}


}
