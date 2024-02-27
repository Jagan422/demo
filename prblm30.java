package practice_programs;


abstract class bank
{
	int amount;
	void getBalance()
	{
		
	}
}

class bankA extends bank
{
	
	void getBalance()
	{
		amount=100;
		System.out.println("Balance in bankA is "+amount);
	}
}

class bankB extends bank
{
	
	void getBalance()
	{
		amount=150;
		System.out.println("Balance in bankB is "+amount);
	}
}

class bankC extends bank
{
	
	void getBalance()
	{
		amount=200;
		System.out.println("Balance in bankC is "+amount);
	}
}


public class prblm30 {

	public static void main(String[] args) {
		bank a=new bankA();
		bank b=new bankB();
		bank c=new bankC();
		a.getBalance();
		b.getBalance();
		c.getBalance();

	}

}
