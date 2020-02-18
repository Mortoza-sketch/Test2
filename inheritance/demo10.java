package inheritance;

class Parent81

{
	int a;
	void display ()
	
	{
		System.out.println(a);
	}
}

class child82 extends Parent81

{
	int b;
	void print()
	
	{
		System.out.println(b);
	}
}

  class child83 extends child82
 
{
	 int c;
	 void show ()
	 {
		 System.out.println(c);
	 }
	 
}

    public class demo10 {
    
	public static void main(String[] args) {
		
		child82 ch = new child82 ();
		
		ch.a = 1;
		ch.b = 2;
		
		ch.display();
        ch.print();
        
         
        child83 ch1 = new child83 ();
        
        ch1.a= 3;
        ch1.b= 4;
        ch1.c= 5;
        
        ch1.display();
        ch1.print();
        ch1.show();
		
		
	}

}
