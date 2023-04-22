package oops.polymorphismtopic.cep;

import java.util.Scanner;

// CompileTime Polymorphism - Method Overloadding
public class TestApp1 
{
	// zero arguments
	public static void addFun() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		int ans = no1+no2;
		System.out.println("Addition : " + ans);
	}
	public static void addFun(int no1,int no2) 
	{
		int ans = no1+no2+no2;
		System.out.println("Addition : " + ans);
	}
	public static void addFun(float no1,float no2) 
	{
		float ans = no1+no2+no2;
		System.out.println("Addition : " + ans);
	}
	public static void addFun(int no1,int no2,int no3) 
	{
		int ans = no1+no2+no3;
		System.out.println("Addition : " + ans);
	}
	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		int ans = no1+no2+no3+no4;
		System.out.println("Addition : " + ans);
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		TestApp1.addFun(10, 20);
		// 1) arguments count
		// 2) argument DataType
		// 3) ----
	}
}
