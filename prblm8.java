package practice_programs;

class calc
{
	public void add(int x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
	public void subtract(int x,int y)
	{
		System.out.println("subtraction is "+(x-y));
	}
	public void multiply(int x,int y)
	{
		System.out.println("product is "+(x*y));
	}
	public void divide(int x,int y)
	{
		System.out.println("Division is "+(x/y));
	}
}

public class prblm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc a=new calc();
		a.add(10, 02);
		a.subtract(5,7);
		a.multiply(12, 3);
		a.divide(7, 02);
		

	}

}
