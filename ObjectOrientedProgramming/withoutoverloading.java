package ObjectOrientedProgramming;

public class withoutoverloading {
	
int add (int a, int b)
	
	{
		System.out.println(a+b);
	}
	
	int add1 (int a, double b)
	
	{
		System.out.println(a+b);
	}
	
	int add2 (double a, double b)
    
	{
		System.out.println(a+b);
	}
	
	int add3 (int a, int b, int c) 
	
	{
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		
overloadingmethod1 om = new overloadingmethod1();
		
		om.add(1, 1);
		om.add(1.1, 1.1);
		om.add(2.1, 2.3);
		om.add(1,2,3);
		
		
		
	}


		
		

	}


