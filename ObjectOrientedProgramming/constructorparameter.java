package ObjectOrientedProgramming;

class constructorparameter {
	
	int x;
	int y;
	
	constructorparameter (int a, int b)
	
	{
		x = a;
		y = b;
	}
	
	void display()
	
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		constructorparameter cd= new constructorparameter(1,2);	
		cd.display();
		

	}

}
