package ObjectOrientedProgramming;

public class constructoroverloadingaccess {
	
	constructoroverloadingaccess (int a, int b)
	
	{
		System.out.println (a+b);
	}
	
  constructoroverloadingaccess (double a, int b)
	
	{
		System.out.println (a+b);
	}
	
  
  constructoroverloadingaccess (int a, double b)
	
	{
		System.out.println (a+b);
	}
	
  
  constructoroverloadingaccess (int a, int b, int c)
	
	{
		System.out.println (a+b+c);
	}

	public static void main(String[] args) {
		
		constructoroverloadingaccess ct = new constructoroverloadingaccess (1,2); 		
		constructoroverloadingaccess c1 = new constructoroverloadingaccess (1.2,2);
		constructoroverloadingaccess c2 = new constructoroverloadingaccess (1.1,2);
		constructoroverloadingaccess c3 = new constructoroverloadingaccess (3,6);
		
	}

}
