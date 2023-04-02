
// 1) Define Package --Optioanl
package oops.classobject;

// 2) Import Statements

public class Student 
{
	// class Object ---> class Properties = 1) Class Dm's + 2) Mf's
//	1) Class Dm's 
	private int rno;
	private String name;
	private int std;
	public void scanData() 
	{
		java.util.Scanner sc  = new java.util.Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " "+ name + " " +std);
	}
}
