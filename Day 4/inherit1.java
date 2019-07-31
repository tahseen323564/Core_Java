//tahseen anwar tahir



public class sbaccount {
	
	int accountno;
	float int_rate;
	float accountbal;
	
	public String get_acc_det()
	{
		String str = "Account no. : " + accountno + "\n" + "Account bal"
					+ accountbal + "\n" + "int rate : " + int_rate ;
		return str;
	}
	
	public float calculateinterest(float amt)
	{
		return amt*int_rate/100;
	}

}
