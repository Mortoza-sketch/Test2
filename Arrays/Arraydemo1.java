 package Arrays;

public class Arraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// arrays: array is the collection of the elements of same data type
		// 2 types of arrays:
		// a) single dimensional array
		// b) multi-dimensional array
		
		//a) single dimensional array
		// i)   Declare an array
		// ii)  Insert values inside an array
		// iii) Find size of an array
		// iv)  Read values from an array
		
		
		// Declare an array
        int a [] = new int [5]; // size of an array is 5. starting index is 0, finishing index is 4
        
        
        //Insert values inside an array
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
		
        //Find size of an array
        System.out.println("Length of an array is: " +a.length); // print length/size of an array
        
        
        //Read values from an array
        
         //System.out.println(a[1]);
        
        for (int i=0; i<=a.length-1; i++)
        	
        {
        	System.out.println(a[i]);
        }
		
	}

}
