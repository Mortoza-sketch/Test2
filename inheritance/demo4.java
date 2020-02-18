package inheritance;

   class X
   
   {
	   int a;
	   
	   
		   void display ()
		   
		   {
			   System.out.println(a);
		   }
	   }
   
   
   class Y extends X
   
   {
	   int b;
	   
	   void print ()
	   
	   {
		   System.out.println(b);
	   }
	   
   }



public class demo4 {

	public static void main(String[] args) {
		
		
		X xobj = new X ();
		xobj.a = 1;
		xobj.display();
		
		
		Y yobj = new Y ();
		yobj.b = 2;
		yobj.a = 1;
		yobj.display();
		yobj.print();
		
		
		
		
		
		

	}

}
