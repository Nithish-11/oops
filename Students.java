package org.system;

public class Students extends Department{
	public void studentInfo() {
		System.out.println("information about student");
		
	}
	public void studentName() {
		System.out.println("Nithish");
	}
public void studentId() {
	System.out.println("RollNo-21275006");
}
public static void main(String[] args) {
	Student record = new Student();
	record.collegeName();
	record.collegeCode();
	record.collegeRank();
	record.deptName();
	record.studentDept();
	record.studentid();
	
}
}
