package ObjectOrientedProgramming;

public class teslamain {

	public static void main(String[] args) {
		
    
		tesla ts= new tesla ();
		
		ts.VIN = 1234;
		ts.MODEL = "MODEL X";
		ts.Price = 96000.00;
		ts.Categories = "Car";
		ts.Make = 2019;
		ts.display();
		
		
		tesla ts1= new tesla();
		
		ts1.VIN = 3456;
		ts1.MODEL = "MODEL S"; 
		ts1.Price = 10000.00;
		ts1.Categories = "Car";
		ts1.Make = 2019;
		ts1.display();
		
		tesla ts2 = new tesla();
		
		ts2.VIN = 6789;
		ts2.MODEL = "MODEL 3";
		ts2.Price = 11000.00;		
		ts2.Categories = "Car";
		ts2.Make = 2019;
		ts2.display();
		
	}

}
