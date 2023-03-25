package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float no1,no2,ans;
		System.out.println("Enter No1 : ");
		no1 = sc.nextFloat();
		System.out.println("Enter No2 : ");
		no2 = sc.nextFloat();
		
		System.out.println("No1 : " + no1);
		System.out.println("No2 : " + no2);

		ans = no1+no2;
		
		System.out.println("Addition : " + ans);
	}
}
