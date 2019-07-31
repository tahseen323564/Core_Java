//tahseen anwar tahir


public class test_sb_acc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbaccount sbacc1=new  sbaccount();
		sbacc1.accountno=13579;
		sbacc1.accountbal=1000;
		sbacc1.int_rate=10;
		sbacc1.deposit(1000);
		System.out.println(sbacc1.get_account_det());
		sbacc1.withdraw_amt(500);
		System.out.println(sbacc1.get_account_det());

	}

}
