
public class test_account {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		sbaccount shyam = new sbaccount("Shyam", 35000);
//		fdaccount Prashant = new fdaccount("Prashant", 20000);

		
		String acct_type = "saving";
		
		if (acct_type == "saving")
			{
				account ram = new sbaccount("ram", 25000);
				
				int amt = ram.calc_interest(ram);
			
				System.out.println("Name: " + ram.name  +"\nAmount: " + ram.amount
						+ "\ninterest: " +amt );
			}
		else
		{
			account ram = new fdaccount("ram", 25000);
			System.out.println("Name: " + ram.name  +"\nAmount: " + ram.amount 
					+ "\ninterest: " + ram.interest() );
			
			
		}
			
	}

}
