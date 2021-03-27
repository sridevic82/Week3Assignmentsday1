package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer comp=new Computer();
		Desktop desk=new Desktop();
		comp.computerModel();
		System.out.println("DesktopSize is" + " " + desk.desktopSize());

	}
public int desktopSize()
{
	return 10;
	
}
}
