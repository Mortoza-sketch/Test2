package ObjectOrientedProgramming;

public class constructoroverloading {
	
	constructoroverloading (int x, int y)
	
	{
		System.out.println(x+y);
	}
	
    constructoroverloading (int x, double y)
	
	{
		System.out.println(x+y);
	}
	
  constructoroverloading (double x, int y)
	
	{
		System.out.println(x+y);
	}
  
  constructoroverloading (int x, int y, int z)
	
	{
		System.out.println(x+y+z);
	}
	

	public static void main(String[] args) {
		
		constructoroverloading co = new constructoroverloading (10,20);
		constructoroverloading c1 = new constructoroverloading (20.5,20);
		constructoroverloading c2 = new constructoroverloading (20,20.5);
		constructoroverloading c3 = new constructoroverloading (1,2,3);
	}

}
