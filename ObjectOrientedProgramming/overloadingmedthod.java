package ObjectOrientedProgramming;

public class overloadingmedthod {

	//In overloading we will use different different data type within the program
	
	void top (int a, int b)
	
	{
		System.out.println(a+b);
		
	}
	
	void top (int a, double b)
	
	{
		System.out.println(a+b);
	}
	
	void top (double a, double b)
	
	{
		System.out.println(a+b);
	}
	
	void top (int a, int b, int c)
	
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		overloadingmedthod om = new overloadingmedthod ();	
		
		om.top(1,1);
		om.top(1.1, 2.1);
		om.top(1.2, 2.1);
		om.top(1, 1,1);
		
		
	}

}
