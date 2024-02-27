package practice_programs;

class shape1
{
	public void print()
	{
		System.out.println("This is shape");
	}
}

class rectangle1 extends shape1
{
	public void print()
	{
		super.print();
		System.out.println("This is rectagular shaped");
	}
}

class square1 extends rectangle1
{
	public void print()
	{
		super.print();
		System.out.println("Square is rectagle");
	}
}

class circle1 extends shape1
{
	public void print()
	{
		System.out.println("This is circular shaped");
	}
}

public class prblm12 {

	public static void main(String[] args) {
		square1 a=new square1();
		a.print();
	    
		

	}

}
