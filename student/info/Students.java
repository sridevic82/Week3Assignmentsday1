package student.info;

public class Students {

	public static void main(String[] args) {
		
		Students stud=new Students();
		stud.getStudentInfo(3);
		stud.getStudentInfo(3, "Sridevi");
		stud.getStudentInfo("sridevic82@gmail.com", 8870151667l);
		// TODO Auto-generated method stub
	
	}
	public void getStudentInfo(int id)
	{
		System.out.println("student id" + id);
	}
	
	public void getStudentInfo(int id,String Name)
	{
		System.out.println("student id" + id);
		System.out.println("student Name" + Name);
	}
	public void getStudentInfo(String email,long phone)
	{
		System.out.println("student email" + email);
		System.out.println("student phone" + phone);
	}


}
