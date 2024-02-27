package practice_programs;

class parent
{
	void print()
	{
		System.out.println("This is parent class");
	}
}

class child extends parent
{
	void print()
	{
		System.out.println("This is child class");
	}
}



public class prblm25 {

	public static void main(String[] args) {
		parent a=new parent();
		child b=new child();
		parent c=new child();
		a.print();
		b.print();
		c.print();

	}

}
