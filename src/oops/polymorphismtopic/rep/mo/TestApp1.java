package oops.polymorphismtopic.rep.mo;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of Vehicle for Specification: ");
	
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice = sc.nextInt();
		Vehicle v = null;
		switch(choice) 
		{
			case 1: v = new TwVehicle();
					v.getSpec();
				break;
			case 2: v = new LmvVehicle();
				    v.getSpec();
				break;
			case 3: v = new HmvVehicle();
		    		v.getSpec();
				break;
		}
	}
}
