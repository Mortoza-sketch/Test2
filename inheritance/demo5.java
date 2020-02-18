package inheritance;

   class MEGAMAN
   
   {
	   int Tamjid;
	   
	   void display()
	   
	   {
		   System.out.println(Tamjid);
	   }
   }
   
   class SUPERMAN extends MEGAMAN
   
   {
	   int Mortoza;
	   
	   void print ()
	   
	   {
		   System.out.println(Mortoza);
	   }
	   
   }
   
   


public class demo5 {

	public static void main(String[] args) {
		
		MEGAMAN mg= new MEGAMAN ();
		mg.Tamjid = 1;
		mg.display();


      SUPERMAN sm = new SUPERMAN ();
    	sm.Mortoza = 2;	  
    	sm.Tamjid = 1;
    	sm.display();
        sm.print();
        
		
	}

}
