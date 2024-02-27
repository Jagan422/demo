package practice_programs;

class a1
{
	final double  pi=3.14;
	
	final void  m1()
	{
		/*   pi=5; gives error   */
		System.out.println("value of pi="+pi);
	}

	
}
final class a2 extends a1
{
	/*void m1()
	{
		System.out.println("This gives error");
	}*/
	
	
}

/* final class a3 extends a2
{
	// This gives error
}
*/


public class prblm27 {

	public static void main(String[] args) {
		a1 a=new a1();
		a.m1();

	}

}
