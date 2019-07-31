//tahseen anwar tahir

package Testing1;

public class ques1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function fun =new function();
		
		int i , j , k ;
		int px=0,ex=0,ox=0;
		int data=0;
		//fun.write(0,0,"Sheet1",data);
		
		for (i=0;i<10;i++)
		{
			data = fun.read(i,0,"Numbers");
			//System.out.println(data);
			if (fun.prime(data))
			{
				System.out.println("prime " + data);
				fun.write(px,0,"Prime",data);
				//fun.read(i, 0, "Sheet2");
				px++;
				
			}
			else if (fun.even(data))
			{
				System.out.println("even " + data);
				fun.write(ex,0,"Even",data);
				ex++;
				
			}
			else
			{
				System.out.println("odd " + data);
				fun.write(ox,0,"Odd",data);
				ox++;
				//System.out.println(data);
			}
		}
		

	}
	
	

}
