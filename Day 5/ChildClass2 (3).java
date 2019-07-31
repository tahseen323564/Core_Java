//tahseen anwar tahir

package Testing;
import Testing1.ParentClass;

public class ChildClass2 extends ParentClass{


	/**
	 * @param args
	 */
	
	//XSSFWorkbook wb = new XSSFWorkbook();
	
	private int a=5;
	int b=6;
	protected int  c= 8;
	public int d=5;
	
	void details()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
	public static void main(String args[])
	{
		ParentClass p =  new ParentClass();
		
//		System.out.println(p.a);
//		System.out.println(b);
//		System.out.println(c);
		System.out.println(p.d);
		
	}


}
