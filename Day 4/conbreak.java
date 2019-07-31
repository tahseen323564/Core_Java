//tahseen anwar tahir


package temp;

public class conbreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i =0 ; i<=10 ; i++)
		{
			int rem = i%2;
			
			if (i==0)
			{
				System.out.println(i);
				continue;
			}
			else
			{
				i+=2;
				System.out.println(i);
				break;
			}
		}

	}

}
