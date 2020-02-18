package inheritance;

 class T
 
 {
	 int a;
	 
	 void display()
	 
	 {
		 System.out.println(a);
	 }
 }
 
 
 class S extends T
 
 {
	 int b;
	 
	 void print ()
	 
	 {
		 System.out.println(b);
	 }
 }



public class demo3 {

	public static void main(String[] args) {
		
		T aobj = new T ();
		aobj.a = 1;
		aobj.display();


      S bobj = new S ();
      bobj.b = 2;
      bobj.a =1;
      bobj.display();
      bobj.print();
		

	}

}
