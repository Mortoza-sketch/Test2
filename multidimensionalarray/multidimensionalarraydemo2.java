package multidimensionalarray;

public class multidimensionalarraydemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("Number of Rows: " +a.length);
		System.out.println("Number of Columns: " +a[0].length);
		
		{
			for (int i=0; i<a.length; i++)
				
			{
				for (int j=0; j<a[i].length; j++)
					
				{
					System.out.println(a[i][j]);
				}
			}
		}

	}

}
