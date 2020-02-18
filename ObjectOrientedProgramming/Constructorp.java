package ObjectOrientedProgramming;

public class Constructorp {

	
	int SID;
	String SNAME;
	char GRADE;
	
	Constructorp (int ID, String NAME, char G)
	
	{
		SID = ID;
		SNAME= NAME;
		GRADE = G;
	}
	
	void display()
	
	{
		System.out.println(SID+" "+SNAME+" "+GRADE);
	}
	
	
}
