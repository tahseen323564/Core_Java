//tahseen anwar tahir


package temp;

public class pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		for (i=0; i< 5; i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(5-i);
			}
			System.out.println();
		}
		
		
		for (i=0; i< 5; i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>i;j--)
			{
				System.out.print(5-i);
			}
			System.out.println();
		}
		
		
		for (i=0; i< 5; i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(i+1);
			}
			for(j=5;j>i;j--)
			{
				//System.out.print(5-i);
			}
			System.out.println();
		}
		//diamond
		for (i=0; i< 5; i++)
		{
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(j=0;j<=i;j++)
			{
				System.out.print(i+1 + " ");
			}
			
			System.out.println();
		}
		for (i=0; i< 4; i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=4;j>i;j--)
			{
				System.out.print(4-i + " ");
			}
			
		
			System.out.println();
		}
		
		
		
		

	}
	
}
