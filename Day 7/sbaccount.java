
public class sbaccount extends account {
	

	int rate=4 ;
	public sbaccount(String name, int amount) {
		super(name, amount);
		this.name = name;
		this.amount = amount;
		this.rate = 4;
		// TODO Auto-generated constructor stub
	}	
	
	public int interest()
	{
//		return this.amount*this.rate/100;
		return rate;
	}
	
}
