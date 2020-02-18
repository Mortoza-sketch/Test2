package ObjectOrientedProgramming;

public class constructorparameter1 {
	
	
	int Tamjid;
	int Sara;
	
	constructorparameter1 (int Mortoza, int Alam)
	
	{
		Tamjid = Mortoza;
		Sara = Alam;
	}
	
	void display()
	
	{
		System.out.println(Tamjid+Sara);
	}

	public static void main(String[] args) {
		
		constructorparameter1 cd = new constructorparameter1(1,1);
		cd.display();
		

	}

}
