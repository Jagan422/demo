package practice_programs;

class a
{
	void print()

{
		System.out.println("This is class a");
		}
}

class b extends a
{
	void print()
	{
		super.print();
		System.out.println("This is class b");
	}
}


public class prblm23 {

	public static void main(String[] args) {
		a x=new b();
		x.print();
		

	}

}
