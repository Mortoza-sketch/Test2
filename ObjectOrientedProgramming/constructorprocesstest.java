package ObjectOrientedProgramming;

public class constructorprocesstest {
	
	int sid;
	String sname;
	char grade;
	
	constructorprocesstest (int id,String name, char g )
	
	{
		sid = id;
		sname = name;
		grade = g;
	}
	
	void display()
	
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	

	public static void main(String[] args) {
		
		constructorprocesstest ct = new constructorprocesstest (2, "Ankur Jain", 'A');
		ct.display();
		
		
	}

}
