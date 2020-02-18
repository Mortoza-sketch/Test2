package ObjectOrientedProgramming;

public class constructortest {
	
	int x;
	int y;
	
	constructortest (int e, int f)
	
	{
		
	 x = e;
	 y = f;
	 
	}
	
	void display()
	
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		
		constructortest ct = new constructortest (2,2);
		ct.display();
		
	}

}
