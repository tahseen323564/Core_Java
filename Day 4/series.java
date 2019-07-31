//tahseen anwar tahir


package temp;

public class series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		for (i=1;i<=3;i++)
		{
			//System.out.println(4+i  + " * " +  2*(1+i) + " = " + (4+i)*2*(1+i));
		}
		
		int count = 10 ;
		i=2;
		int pri=0,sum=0;
		int sumset=0;
		
		while(count>0)
		{
			int flag=0;
			//int sumset;
			//int sum;
			for ( j =2; j <= Math.sqrt(i) ; j++)
			{
				if (i%j == 0 )
				{
					flag=1;
					break;
				}
			}
			
			if (flag==0)
			{
				if ( pri%4==0 && pri%4==1)
				{
					System.out.print(i + " ");
				}
				else if (pri%4==2)
				{
					sum=i;
				}
				else
				{
					System.out.print(" " + (sum+i) );
					sum=0;
				}
				
				if(pri%5==0)
				{
					sumset=i;
				}
				else if (pri%5==1 || pri%5==2 || pri%5==3)
				{
					sumset+=i;
				}
				else
				{
					System.out.println("sum of set " + (sumset+i) + " hello " );
					sumset=0;
				}
				
				
				count--;
				pri++;
			}
			i++;
				
		}
	}
}
