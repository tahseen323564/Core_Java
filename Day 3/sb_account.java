//tahseen anwar tahir


public class sb_account extends sbaccount {
	public boolean withdraw (float withdraw_amount)
	{
		if (accountbal - withdraw_amount >= 500)
		{
			accountbal-=500;
			return true ;
		}
		else
			return false;
	}

}