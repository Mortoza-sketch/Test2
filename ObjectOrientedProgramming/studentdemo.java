package ObjectOrientedProgramming;

public class studentdemo {

	int sid;
	String sname;
	char Grade;
	
	void getValues(int id, String name, char G)
	
	{
		sid = id;
		sname= name; 
		Grade = G;
	}
	
	void display()
	
	{
		
	
	System.out.println(sid+" "+sname+" "+Grade);	
	
	}
}
