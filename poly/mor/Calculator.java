package poly.mor;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		cal.add(5, 6);
		cal.add(5, 6, 7);
		cal.sub(5, 6);
		cal.sub(678945d, 12345d);
		cal.mul(5, 6);
		cal.mul(5, 678945d);
		cal.div(15,5 );
		cal.div(12345d, 5);

	}
	
	public void add(int a, int b)
	{
		System.out.println("the addition of 2 nos is" + (a+b));
	}
	
	public void add(int a, int b,int c)
	{
		System.out.println("the addition of 3 nos is" + (a+b+c));
	}
	public void mul(int a, int b)
	{
		System.out.println("the multiplication of 2 int nos is" + (a*b));
	}
	public void mul(int a,double d)
	{
		System.out.println("the mul  of int and double nos is" + (a*d));
		
	}
	public void sub(int a,int b)
	{
		System.out.println("the sub  of 2 int nos is" + (a-b));
		
	}
	public void sub(double e,double d)
	{
		System.out.println("the subraction of 2 double nos is" + (e-d));
		
	}
	public void div(int f,int a)
	{
		System.out.println("the division of 2 int nos is" + (f/a));
		
	}
	public void div(double d,int a)
	{
		System.out.println("the addition of double and int nos is" + (d/a));
		
	}
	
	
	

}
