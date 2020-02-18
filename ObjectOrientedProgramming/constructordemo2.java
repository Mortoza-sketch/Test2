package ObjectOrientedProgramming;

public class constructordemo2 {

	//default constructor
	//In default constructor we define the value in centric class instead of the main class
	
	int x;
	int y;
	
	constructordemo2 ()
	
	{
		x = 10;
		y = 20;
	}
	
	void display ()
	
	{
	System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		constructordemo2 cd = new constructordemo2();
		cd.display();
		
	}

}
