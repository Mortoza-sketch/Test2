package thiskeyword;

public class thiskeyworddemo3 {
	
	int a, b;
	
	void getValues (int a, int b)
	
	{
		
		this.a = a;
		this.b = b;
		
	}
	
	void printValues ()
	
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	public static void main(String[] args) {
		
		
		thiskeyworddemo3 th = new thiskeyworddemo3 ();
		th.getValues(1, 2);
		th.printValues();
		
		

	}

}
