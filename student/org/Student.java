package student.org;

import org.college.College;
import org.department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College coll=new College();
		Department dept=new Department();
		Student stu=new Student();
		coll.collegeCode();
		coll.collegeName();
		coll.collegeRank();
		dept.departmentName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		}
	
	public void studentName()
	{
System.out.println("Name is Sridevi");
}
	public void studentDept()
	{
		System.out.println("Student Dept is ECE");
	}
	public void studentId()
	{
		System.out.println("Student id is 6000897");
}
}
