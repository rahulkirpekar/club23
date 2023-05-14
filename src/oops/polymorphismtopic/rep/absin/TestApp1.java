package oops.polymorphismtopic.rep.absin;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		int choice = sc.nextInt();
		Vehicle vehicle = null;
		switch(choice) 
		{
				case 1 : vehicle = new  TwVehicle();
						 vehicle.test1();
						 break;	
				case 2 : vehicle = new  LmvVehicle();
						 vehicle.test1();
						 break;			
		}
	}
}
