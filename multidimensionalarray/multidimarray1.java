package multidimensionalarray;

public class multidimarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("Number of Rows:" +a.length);
		System.out.println("Number of columns: " +a[0].length);
		
		for (int r[]:a)
			
		{
			
			for (int i:r)
				
			{
				System.out.println(i);
			}
		}
		
		
		
	}

}
