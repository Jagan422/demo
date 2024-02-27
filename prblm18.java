package practice_programs;

class student1
{
	void print()
	{
		System.out.println("Name = Unknown");
	}
	void print(String a)
	{
		System.out.println("Name = "+a);
	}
}



public class prblm18 {

	public static void main(String[] args) {
		student1 a=new student1();
		a.print("ram");
		a.print();

	}

}
