package ObjectOrientedProgramming;

public class overloadingmethod1 {
	
	
	//In overloading method we can declare and execute different different types of data type
	//method overloading is a feature that allows more than one method having the same name
	//method overloading is a feature that allows more than one method having the same name
	//method overloading is a feature that allows a class to have more than one method having the same name
	//method overloading is a feature that allows a class to have more than one method having the same name
	
	
	
	void add (int a, int b)
	
	{
		System.out.println(a+b);
	}
	
	void add (int a, double b)
	
	{
		System.out.println(a+b);
	}
	
	void add (double a, double b)
    
	{
		System.out.println(a+b);
	}
	
	void add (int a, int b, int c) 
	
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
