package mypack;

public class Teacher extends Person1{
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double salary;
	
		Teacher(double salary, String name){
			
			super(name);
			this.salary=salary;
		}
		
	
				
}
