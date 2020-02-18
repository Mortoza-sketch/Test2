package ifelse;

public class ifelsegreatestthanthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 200;
		int b = 100;
		int c = 900;
		int d = 700;
		int e = 1000;
	
		if (a>b && a>c && a>d && a>e)
		
		{	
			System.out.println("a is greatest");
		}
		
		else if (b>a && b>c && b>d && b>e)
			
		{
			System.out.println("b is greatest");
		}
		
		else if (c>a && c>b && c>d && c>e)
			
		{
			System.out.println("c is greatest");
		}
		
		else if (d>a && d>b && d>c && d>e)
			
		{
			System.out.println("d is greatest");
		}
		
		else
			
		{
		  System.out.println("e is greatest");
		}
			
	}

}
