package practice_programs;

class myDetails
{
	String firstName,lastName;
	int age;
	void store(String a,String b,int c)
	{
		firstName=a;
		lastName=b;
		age=c;
	}
	void print()
	{
		System.out.println("First name="+firstName);
		System.out.println("Last name="+lastName);
		System.out.println("age="+age);
	}
}

public class prblm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDetails a=new myDetails();
		a.store("Mukesh", "S", 21);
		a.print();

	}

}
