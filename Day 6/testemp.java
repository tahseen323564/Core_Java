//tahseen anwar tahir

package Testing1;

public class testemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consultant cs = new consultant(190 , "tahir", 100, 300);
		FTE ft = new FTE (201, "tahseen", 350);
		System.out.println(cs.ename + "  " + cs.calc_month_salary());
		System.out.println(ft);
		

	}

}
