package oops.inhtopic.si;

import java.util.Scanner;

// Single Inheritance
// Child Class
public class Employee extends Person
{
	public int id;
	public int salary;
	public String dsgn;
	
	public static void main(String[] args) 
	{
		// e---->name,id,salary,dsgn
		Employee e = new Employee();
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Id : ");
		e.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		e.name = sc.nextLine();
		System.out.println("Enter Salary : ");
		e.salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		e.dsgn = sc.nextLine();
		
		System.out.println(e.id + " "+e.name + " "+ e.salary + " "+ e.dsgn);
	}
}
