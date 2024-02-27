package practice_programs;

class f1
{
	void f1(int n)
	{
		System.out.println("Given integer="+n);
	}
	
	void f1(char a)
	{
		System.out.println("Given character="+a);
	}
}


public class prblm21 {

	public static void main(String[] args) {
		f1 a=new f1();
		a.f1(521);
		a.f1('m');

	}

}
