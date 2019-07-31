//tahseen anwar tahir


package temp;

public class string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "i am learning java Core";
		String t = "i am learning java core";
		int c = s.length();
		//System.out.println(c);
		
		//System.out.println(s.compareToIgnoreCase(t));
		
		String b = s.substring(0,4);
		
		//System.out.println(b);
		
		int a=0;
		int count=0;
		
		while (s.indexOf('a',a)!= -1 && a!=s.length())
		{
			count++;
			
			a=s.indexOf('a',a+1) +1;
			
			System.out.println(a); 
			
			//a++;
		}
		
		
		
		System.out.println("count" + count);

	}

}
