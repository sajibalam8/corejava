package mypack;

import java.util.Scanner;

public class PackageOne {
	
		public static boolean checkPalindrome(String a) {
			String b= "";
			for ( int i=a.length()-1 ; i>=0; i--) {
				
				 b =b + a.charAt(i)+ "";
				 
				
				
			}
	System.out.println("b"+"-----------"+b);		
	System.out.println("a"+"-------------"+a);		
			if (b.equalsIgnoreCase(a)){
				
				return true;
				
				
			}
			
			return false;
			
			
		}

		
		public static Student convertStringToObject(String student) {
			///We split on comma for string and make a string array
			String[] array = student.split(",");
			// Convert String Array to Object
			String id= array[0];
			String name= array[1];
			String universityName= array[2];
			
			Student student1 = new Student(id,name,universityName);
			
			return student1;
			
			
			
			
		}
		
		
		public static int add ( int a, int b) {
			return a +  b;
		}
		
		
		public static int subtract ( int a, int b) {
			return a - b;
		}
		
		
		public static int multiplication ( int a, int b) {
		
			return   a*b;
		}
		
		public static int division ( int a, int b) {
			
			
			return  a /  b;
		}
		
		
		
	
	public static void main(String[] args) {
		
		
		Student s1= new Student("123", "Sajib", "JavaSchool");
		Student s2= null;
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		
		s2=s1;
		s2.id="12223";
		
		System.out.println("AfterChanges1"+s1);
		System.out.println("AfterChanges2"+s2);
		
		
		
		
		/*
		 * 
		 * 
		 * 
		
		int result=0;
		Scanner input=  new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=input.nextInt();
		System.out.println("Enter the second number:");
		int b=input.nextInt();
		System.out.println("What operation to perfom:");
		System.out.println("+,-,*,/");
		char c = input.next().charAt(0);
		
		System.out.println(Calculator.calculator(a,b,c));
		*/
		
	}
	
	
		}
		
		/*
	}
		int result=0;
		Scanner input=  new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=input.nextInt();
		System.out.println("Enter the second number:");
		int b=input.nextInt();
		System.out.println("What operation to perfom:");
		System.out.println("+,-,*,/");
		char c = input.next().charAt(0);
		
		
		if (c=='+') {
			
		 result=add(a,b);
		}
		
		else if (c=='-') {
			

			result=subtract(a,b);
		}
		
		
		else if (c=='*') {
			
			result=multiplication(a,b);
		}
		
		
		else if	(c =='/') {
			
			result=	division(a,b);
		}
		
		System.out.println("result:" +result);
	}

	
	*/


	
				

		// TODO Auto-generated method stub
			/*
			 System.out.println(checkPalindrome("racecar"));
			 Student stud= new Student("123", "Alam", "JavaCodingInstitute");
			// System.out.println("The following are students info"+stud);
		String c1=	 "11 ,Alam, JavaCodingInstitute";
		String c2=	 "11 ,Alam, JavaCodingInstitute";
		String c3=	 "11 ,Alam, JavaCodingInstitute";
		String c4=	 "11 ,Alam, JavaCodingInstitute";
		String c5=	 "11 ,Alam, JavaCodingInstitute";
		
		Student stud1=convertStringToObject(c1);
		System.out.println("Student1 is :" +stud1);
		Student studenttype[]= new Student[5];
		studenttype[0]=convertStringToObject(c1);
		studenttype[1]=convertStringToObject(c2);
		studenttype[2]=convertStringToObject(c3);
		studenttype[3]=convertStringToObject(c4);
		studenttype[4]=convertStringToObject(c5);
		
		for (Student s : studenttype) {
			
			System.out.println ("The object" +s);
					
	}
*/




//day 1 today we covered String & Array & object and how make string to object Day 1
