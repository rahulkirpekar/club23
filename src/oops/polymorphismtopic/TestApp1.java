package oops.polymorphismtopic;

public class TestApp1 extends A
{
	public TestApp1() 
	{
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
		System.out.println("No : " + obj.no);
		
	}
}
