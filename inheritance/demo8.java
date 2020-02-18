package inheritance;

class O

{
	int a;
	
	void display()
	
	{
		System.out.println(a);
	}
}

class P extends O

{
	int b;
	
	void print ()
	
	{
		System.out.println(b);
	}
}

class L extends P

{
	int c;
	
	void show ()
	
	{
		System.out.println(c);
	}
}



public class demo8 {

	public static void main(String[] args) {
		
		L k = new L ();
		k.a = 1;
		k.b = 2;
		k.c = 3;
		
		k.display();
		k.print();
		k.show();
		

	}

}
