package inheritance;

  class E
  
  {
	  int a;
	  
	  void display()
	  
	  {
		  System.out.println(a);
	  }
  }
  
  
  class F extends E
  
  {
	  int b;
	  
	  void print()
	  
	  {
		  System.out.println(b);
	  }
	  
  }
  


public class demo2 {

	public static void main(String[] args) {
		
		
		E aobj = new E ();
		aobj.a= 10;
		aobj.display();


       F bobj = new F ();
       bobj.b = 20;
       bobj.a = 10;
       bobj.display();
       bobj.print();
		
		
		
	}
}
