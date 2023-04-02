package oops.constructortopic;
public class TestApp2 
{
	int no1,no2,no3,no4,no5,no6,no7;
	public TestApp2() 
	{
	}
	public TestApp2(int no1,int no2,int no3,int no4,int no5) 
	{
		this.no1=no1;
		this.no2=no2;
		this.no3=no3;
		this.no4=no4;
		this.no5=no5;
	}
	public TestApp2(int no1,int no2,int no3,int no4,int no5,int no6,int no7) 
	{
		this(no1, no2, no3, no4, no5);
		this.no6=no6;
		this.no7=no7;
	}
	public void disp() 
	{
		System.out.println(no1 + " " + no2 + "  "+ no3 + "  "+no4 + "  "+no5 + "  "+no6 +" "+no7);
	}
	public static void main(String[] args) 
	{
		TestApp2 ap = new TestApp2(1, 2, 3, 4, 5, 6, 7);
		ap.disp();
	}
}
