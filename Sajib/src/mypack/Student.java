package mypack;

public class Student extends Person1 {
		@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", universityName=" + universityName + "]";
	}


		public String id;
		public String universityName;
		
		
		Student(String id, String name, String universityName){
			super(name);
			this.id=id;
			this.universityName=universityName;
		}
		
}



