package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	private int rno;// Per object memory allocation
	private String name;// Per object memory allocation
	private int std;// Per object memory allocation
	private static String schoolName;//---Single Copy for One class
	
	public static void setSchoolName() 
	{
		Scanner sc = new Scanner(System.in);
		schoolName = sc.nextLine();
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
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
		System.out.println(rno + " "+name + " " +std + " " + schoolName);
	}
	
	public static void main(String[] args) 
	{
		Student.setSchoolName();
		Student s1 = new Student();// s1--->[rno name std]--------|
		Student s2 = new Student();// s2--->[rno name std]--------|--->schoolName
		Student s3 = new Student();// s3--->[rno name std]--------|

		s1.scanData();
		s2.scanData();
		s3.scanData();

		s1.dispData();
		s2.dispData();
		s3.dispData();
		
		s2.schoolName = "Meghdoot";

		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
