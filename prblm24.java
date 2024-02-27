package practice_programs;

interface func1
{
	static void maths()
	{
		System.out.println("I like maths");
	}
}

interface func2
{
	static void programming()
	{
	System.out.println("I like programming");
	}
}

class boy implements func1,func2
{
	void print()
	{
		func1.maths();
		func2.programming();
	}
}



public class prblm24 {

	public static void main(String[] args) {
		boy a=new boy();
		a.print();

	}

}
