package overriding;

class bank

{
	double rateofinterest()
	
	{
		return 0;
	}
}

class citi extends bank

{
	double rateofinterest ()
	
	{
		return 5;
	}
}

class bofa extends citi

{
	double rateofinterest()
	
	{
		return 10;
	}
}

class cp1 extends bofa

{
	double rateofinterest()
	
	{
		return 22;
	}
}

public class overridingdemo {

public static void main(String[] args) {
	
	citi ci = new citi ();
	System.out.println(ci.rateofinterest());

    	
	bofa bo = new bofa ();
	System.out.println(bo.rateofinterest());
	
	cp1 cp = new cp1 ();
	System.out.println(cp.rateofinterest());
	
		
	}

}
