//tahseen anwar tahir

package Testing1;

abstract class employee {
	int eid;
	String ename;
	int rate_per_unit;
	
	public abstract int calc_month_salary();

	public int getEid() {
		return eid;
	}

	public employee(int eid, String ename, int rate_per_unit) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.rate_per_unit = rate_per_unit;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getRate_per_unit() {
		return rate_per_unit;
	}

	public void setRate_per_unit(int rate_per_unit) {
		this.rate_per_unit = rate_per_unit;
	}
	

}
