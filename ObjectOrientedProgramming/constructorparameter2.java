package ObjectOrientedProgramming;

public class constructorparameter2 {
	
	int Tamjid;
	int Sara;
	
	constructorparameter2 (int Engineer, int Teacher)
	
	{
		Tamjid = Engineer;
		Sara = Teacher;
	}
	
	void display ()
	
	{
		System.out.println(Tamjid+Sara);
		
	}
	

	public static void main(String[] args) {
		
		constructorparameter2 cd = new constructorparameter2 (1,1);
		cd.display();
			
	}

}
