package practice_programs;


abstract class  parent1 
{
	void message()
	{
		System.out.println("This is parent class");
	}
}

class sub1 extends parent1
{
	void message()
	{
		System.out.println("This is first subclass");
	}
}

class sub2 extends parent1
{
	void message()
	{
		System.out.println("This is second subclass");
	}
}

public class prblm29 {

	public static void main(String[] args) {
		parent1 a=new sub1();
		parent1 b=new sub2();
		a.message();
		b.message();

	}

}
