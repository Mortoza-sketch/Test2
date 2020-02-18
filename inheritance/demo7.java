package inheritance;

class Parent1

{
	int a;
	void display ()
	
	{
		System.out.println(a);
	}
}

 class child11 extends Parent1
 
 {
	 int b;
	 void print ()
	 
	 {
		 System.out.println(b);
	 }
 }
 
 class child12 extends child11
 
 {
	 int c;
	 void show()
	 {
		 System.out.println(c);
	 }
 }


public class demo7 {

	public static void main(String[] args) {
		
		child12 ch = new child12();
		ch.a = 1;
		ch.b = 2;
		ch.c = 3;
		
		ch.display();
		ch.print();
		ch.show();
		
		

	}

}
