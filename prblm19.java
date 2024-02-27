package practice_programs;

class addAmount
{
	 static int amount=50;
	 
	 void addAmount()
	 {
		 System.out.println("Available balance="+amount);
	 }
	 void addAmount(int n)
	 {
		 amount+=n;
		 
		 System.out.println("Amount added and total balance="+amount);
	 }
	
}


public class prblm19 {

	public static void main(String[] args) {
		addAmount a=new addAmount();
		a.addAmount();
		a.addAmount(150);
		addAmount b=new addAmount();
		b.addAmount();

	}

}
