package mypack;

public class Student {
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", universityName=" + universityName + "]";
	}


		public String id;
		public String name;
		public String universityName;
		
		
		Student(String id, String name, String universityName){
			
			this.id=id;
			this.name=name;
			this.universityName=universityName;
		}
		
}



