//tahseen anwar tahir


public class newacct {

	int account_no;
	float accountbal, int_rate ;
	
	public newacct(int account_no)
	{
		this.account_no = account_no;
	}
	
	public newacct(int account_no, float accountbal,float int_rate)
	{
		this.account_no = account_no;
		this.accountbal = accountbal;
		this.int_rate = int_rate;
	}
	public String get_account_det()
	{
		String str = account_no + "" + accountbal + "" + int_rate;
		return str;
	}
	public float calculateinterest(float amt)
	{
		return amt*int_rate/100;
	}
	
	
}
