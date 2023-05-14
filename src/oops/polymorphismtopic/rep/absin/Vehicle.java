package oops.polymorphismtopic.rep.absin;

// pure [100%] Abstract class
public abstract interface Vehicle 
{
	// 1) Constant Variable--[public static final]
	public static final int NO1 = 10;// public static final 
	public static int NO2 = 20;// final 
	static final int NO3 = 30;// public 
	public final int NO4 = 40;// static 
	public int NO5 = 50;// static final 
	
	// 2) abstract method--[public abstract]
	public abstract void test1();
	void test2();// public abstract 
	public void test3();// abstract 
	abstract void test4();// public 
	
	// 3) Non-Abstract Method
			// 1) static method
			// 2) private method
			// 3) default method
	
	// static / default / private
	static void test5() // JDK-8
	{
		
	}
	default void test6()// JDK-8 
	{
		
	}
	private void test7() // JDK-9
	{
		
	}
}
