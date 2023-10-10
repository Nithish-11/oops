package org.system;

public class Student extends Department {
	public void studentName() {
		System.out.println("Nithish");
	}
public void studentDept() {
	System.out.println("MCA");
}
public void studentid() {
	System.out.println("Roll No - 21275006");
}
public static void main(String[] agrs) {
	Student details = new Student();
	details.collegeName();
	details.collegeCode();
	details.collegeRank();
	details.deptName();
	details.studentDept();
	details.studentid();
	
}

}
