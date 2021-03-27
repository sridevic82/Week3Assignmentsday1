package interf.pac;

public class Desktop implements Software {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Desktop desk=new Desktop();
desk.hardWareResources();
desk.softwareWareResources();
desk.deskTopModel();

		
		
	}

	
	public void deskTopModel()
	{
		System.out.println("Model is Hp");
	}


	public void hardWareResources() {
		// TODO Auto-generated method stub
		System.out.println("HadwareResources");
	}


	public void softwareWareResources() {
		// TODO Auto-generated method stub
		System.out.println("softwareResources");
	}
	
	
	
}


