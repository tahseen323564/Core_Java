
//tahseen anwar tahir

package Testing1;

public class consultant extends employee{
	int hour_worked;
	
	
public consultant(int eid, String ename, int hour_worked , int rate_per_unit) {
		super(eid, ename, rate_per_unit);
		this.hour_worked = hour_worked;
	}
	
	public int calc_month_salary()
	{
		int sal;
		sal = hour_worked*rate_per_unit*60;
		return sal;
	}
	

}
