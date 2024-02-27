package practice_programs;


class animals1
{
	void cats()
	{
		
	}
	void dogs()
	{
		
	}
}

class cats extends animals1
{
	void cats()
	{
		System.out.println("cats meow");
	}
}

class dogs extends animals1
{
	void dogs()
	{
		System.out.println("dogs bark");
	}
}


public class prblm31 {

	public static void main(String[] args) {
		animals1 a=new cats();
		animals1 b=new dogs();
		a.cats();
		b.dogs();

	}

}
