package practice_programs;

class member
{
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	
	public void printSalary()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("phoneNumber="+phoneNumber);
		System.out.println("Address="+address);
		System.out.println("Salary="+salary);
	}
}

class employee extends member
{
	String specialization;
	
}

class manager extends member
{
	String department;
}

public class prblm10 {

	public static void main(String[] args) {
		employee a=new employee();
		manager b=new manager();
		a.name="Rahul";
		a.age=25;
		a.phoneNumber="8956231478";
		a.address="chennai";
		a.salary=45000;
		
		b.name="Suresh";
		b.age=35;
		b.phoneNumber="7412589632";
		b.address="coimbatore";
		b.salary=95000;
		
		a.printSalary();
		System.out.println("------------------");
		b.printSalary();
		

	}

}
