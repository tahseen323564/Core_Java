
public class fdaccount extends account{
	
	public fdaccount(String name, int amount) {
		super(name, amount);
		this.name = name;
		this.amount = amount;
		this.rate = 6;
		// TODO Auto-generated constructor stub
	}

	public int interest()
	{
//		return this.amount*this.rate/100;
		return this.rate;
	}
	
	
}
