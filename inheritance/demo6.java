package inheritance;

class U   //parent class

{
	int a;
	
	void display ()
	
	{
		System.out.println(a);
	}
}

class V extends U //child class

{
	int b;
	
	void print ()
	
	{
		System.out.println(b);
	}
}

class Z extends V     //child class 1

{
	int c;
	
	void show ()
	
	{
		System.out.println(c);
	}
}



public class demo6 {

	public static void main(String[] args) {
		
         
		Z zobj = new Z ();
		zobj.a=1;
		zobj.b=2;
		zobj.c=3;
		
		zobj.display();
        zobj.print();
        zobj.show();
		
		
	}

}
