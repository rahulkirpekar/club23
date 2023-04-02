package oops.constructortopic;

public class Student 
{
	// 1) Dm's
	private int rno;//0
	public String name;//null
	private int std;//0
	
	public Student() 
	{
		System.out.println("START :: Default Constructor");
		rno = 1;
		name = "rahul";
		std = 12;
		System.out.println("EXIT :: Default Constructor");
	}
	// Parameterized Constructor
	public Student(int rno,String name,int std) 
	{
		this();
		System.out.println("START :: Para Constructor");
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("EXIT :: Para Constructor");
	}
	// Copy Constructor
//	public Student(Student s) 
//	{
//		System.out.println("START :: Copy Constructor");
//		rno = s.rno;
//		name = s.name;
//		std = s.std;
//		System.out.println("EXIT :: Copy Constructor");
//	}
	// 2) mf's
	public static void main(String[] args) 
	{
		Student s = new Student(1,"krunal",12);
		System.out.println(s.rno + " "+ s.name + " " + s.std);  

//		Student s1 = new Student(s);
//		System.out.println(s1.rno + " "+ s1.name + " " + s1.std);  
	}
}
