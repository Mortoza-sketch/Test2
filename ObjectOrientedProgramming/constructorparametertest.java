package ObjectOrientedProgramming;

public class constructorparametertest {
	
	int a;
	int b;
	
	constructorparametertest (int x, int y)
	
	{
		a = x;
		b = y;
	}
	
	void display()
	
	{
		System.out.println(a+b);
	}
	
	

	public static void main(String[] args) {
		
		constructorparametertest ct  = new constructorparametertest (1,1);
		ct.display();
		
	}

}
