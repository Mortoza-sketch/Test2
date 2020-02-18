package ObjectOrientedProgramming;

public class constructordemo3 {
	
	//default constructor
	//in default constructor we define the value in centric class instead of the main class
	
	int x;
	int y;
	
	constructordemo3 ()
	
	
	{
		
	x = 1;	
	y = 2;
	
	}
	
	void display()
	
	{
		System.out.println(x+y);
	}
	
	

	public static void main(String[] args) {
		
		constructordemo3 cd = new constructordemo3 ();
		cd.display();
		
	}

}
