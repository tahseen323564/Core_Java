//tahseen anwar tahir


public class switch1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		while(n>0)
		{
			int temp=n%10;
			n/=10;
					switch (temp)
					{
					
					case 1:
						System.out.println("one");
						break;
					case 2:
						System.out.println("TWo");
						break;
					case 3:
						System.out.println("three");
						break;
					case 4:
						System.out.println("four");
						break;
					case 5:
						System.out.println("five");
						break;
					case 6:
						System.out.println("six");
						break;
					case 7:
						System.out.println("seven");
						break;
					case 8:
						System.out.println("eight");
						break;
					case 9:
						System.out.println("nine");
						break;
					case 0:
						System.out.println("zero");
						break;
					default :
						System.out.println("Entry Not Matched");
						break;
					
						
						
					}
			
		}
		
		
		

	}

}
