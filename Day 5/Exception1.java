//tahseen anwar tahir

package Testing1;

public class Exception1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0, c=5;
		int arr[] = {1,2,3,4,5};
		
		try 
		{
			
			System.out.println(a/b + arr[5]);
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Out of block");

	}

}
