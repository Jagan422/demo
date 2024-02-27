package practice_programs;

class utilities
{
	public void check(int a)
	{
		if(a>0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is not positive");
		}
	}
	public void check(String a)
	{
		if(a=="")
		{
			System.out.println("Given string is null");
		}
		else
		{
			System.out.println("Given string is not null");
		}
	}
	public void check()
	{
		System.out.println("Hello world");
	}
}

public class prblm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utilities a=new utilities();
		a.check(10);
		a.check("");
		a.check();

	}

}
