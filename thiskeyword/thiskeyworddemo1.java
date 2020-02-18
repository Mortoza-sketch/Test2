package thiskeyword;

public class thiskeyworddemo1 {
	
	int a,b;
	
	void getValues (int a, int b)
	
	{
		this.a=a;
		this.b=b;
		
	}
	
	void display()
	
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		thiskeyworddemo1 th= new thiskeyworddemo1();
		th.getValues(10, 20);
		th.display();
		

	}

}
