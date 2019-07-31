//tahseen anwar tahir


package temp;

public class string1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am learning java";
		
//		for (int i = 0; i< s.length(); i++)
//		{
//			if (s.charAt(i)==' ')
//				System.out.println();
//			else
//				System.out.print(s.charAt(i));
//		}
//		
		int a=0;
		int count=0;
		int temp=0;
		
		while (s.indexOf(' ',a)!= -1)
		{
			//count++;
			 
			System.out.println(s.substring(temp,s.indexOf(' ',a+1)+1)); 
			
			a=s.indexOf(' ',a+1) +1;
			
			temp=a;
			
		}
		System.out.println(s.substring(a,s.length()));
		

	}

}
