//tahseen anwar tahir

package Testing1;

public class FTE extends employee{
	int daywork;
	
	public FTE(int eid, String ename, int rate_per_unit) {
		super(eid, ename, rate_per_unit);
		this.daywork = daywork;
		
		// TODO Auto-generated constructor stub
	}

	
	
	public int calc_month_salary()
	{
		return daywork * rate_per_unit; 
	}
	

}
