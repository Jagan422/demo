package practice_programs;

class student
{
	String name;
	int rollNo;
	String phone;
	String address;
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll no="+rollNo);
		System.out.println("phone number="+phone);
		System.out.println("Address="+address);
	}
}


public class prblm14 {

	public static void main(String[] args) {
		student a=new student();
		a.name="John";
		a.rollNo=2;
		a.phone="9523687412";
		a.address="Bangalore";
		a.display();
		System.out.println();
		
		student b=new student();
		b.name="Sam";
		b.rollNo=1;
		b.phone="9214787412";
		b.address="Hyderabad";
		b.display();

	}

}
