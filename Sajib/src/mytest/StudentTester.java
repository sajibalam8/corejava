package mytest;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTester {
	static Scanner scan = new Scanner(System.in);

	public static StudentService sService = new StudentService();

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * 1: Want to add student 2: Remove Student 3: find student by name 4: find
		 * student by Id 5: Show all Students 6: exit
		 */
		while (true) {
			menu();

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				addStudent();
				break;
			case 2:
				removeStudent();
				break;
			case 3 :
				findStudentByName();
				break;
			case 4 :
				findStudentById();
				break;
			case 5 :
				showAllStudents();
				break;
			case 6 :
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");


		}

		}

	}

	public static void menu() {

		System.out.println("1: Want to add student");
		System.out.println("2: Remove Student");
		System.out.println("3: find student by name");
		System.out.println("4: find student by Id");
		System.out.println("5: Show all Students");
		System.out.println("6: Exit");

	}

	public static void addStudent() {

		System.out.println("enter the id");
		int id = scan.nextInt();
		System.out.println("enter the name");
		String name = scan.next();
		System.out.println("enter the number of subjects");
		int subjects = scan.nextInt();
		int[] marks = new int[subjects];

		for (int i = 0; i < subjects; i++) {

			System.out.println("enter the marks for subject" + i);
			int mark = scan.nextInt();
			marks[i] = mark;
		}

		Student s = new Student(id, name, subjects, marks);

		sService.addStudent(s);

	}

	public static void removeStudent() {

		System.out.println("enter the name");
		String name = scan.next();
		Student studentName = sService.findStudentByName(name);
		boolean userRemoved = sService.removeStudent(studentName);

		if (userRemoved) {

			System.out.println("Student is Removed");

		} else {
			System.out.println("There is no student with this name");

		}
	}

	public static void findStudentByName() {

		System.out.println("enter the name");
		String name = scan.next();
		Student student = sService.findStudentByName(name);
		if (student == null) {

			System.out.println("There is no student with that name");

		} else {
			System.out.println("The Student is" + student);

		}

	}

	public static void findStudentById() {

		System.out.println("enter the id");
		int id = scan.nextInt();
		Student student = sService.findStudentById(id);
		if (student == null) {

			System.out.println("There is no student with that id");

		} else {
			System.out.println("The Student is" + student);

		}

	}

	public static void showAllStudents() {

		ArrayList<Student> students = sService.getAllStudents();
		for (Student s : students) {

			System.out.println(s);
		}

	}
}
