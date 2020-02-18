package inheritance;

class Parent22

{
	int a;
	void display()
	
	{
		System.out.println(a);
	}
}

class Child23 extends Parent22

{
	int b;
	void print()
	
	{
		System.out.println(b);
	}
}

class Child24 extends Child23

{
	int c;
	void show ()
	
	{
		System.out.println(c);
	}
}


public class demo9 {

	public static void main(String[] args) {
		
	Child23 ch = new Child23();	
	ch.a= 10;
	ch.b=20;
	ch.display();	
	ch.print();
	
	Child24 ch1= new Child24();
	ch1.a=5;
	ch1.b=11;
	ch1.c=6;
	ch1.display();
	ch1.print();
    ch1.show();
	

	}

}
