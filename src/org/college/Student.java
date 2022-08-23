package org.college;

public class Student extends Hostel{
	
	public void studentName() {
		System.out.println("Selva");
	}
	public void studentDept() {
		System.out.println("IT");
	}
	public void studentId() {
		System.out.println("123456");
	}
	public static void main(String [] args) {
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.studentId();
		s.studentName();
		s.studentDept();
		s.deptName();
		s.hostelName();
		
		
	}
	
}
