
public abstract class account {

	public abstract int interest();
	
	String name ;
	int amount;
	int rate;

	
	public account(String name, int amount) {
//		super();
		this.name = name;
		this.amount = amount;
	}
	
	public void display()
	{
		System.out.println(this.name + this.amount);
	}
	
	public void sbint()
	{
		
//		System.out.println();
		
	}
	
	public int calc_interest(account a)
	{
		
		
		return (amount+ amount*a.interest()/100);
	}



	
}
