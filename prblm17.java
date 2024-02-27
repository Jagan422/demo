package practice_programs;
import java.util.Scanner;


class operations
{
	void add(int x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
	
	void sub(int x,int y)
	{
		System.out.println("Subtraction is "+(x-y));
	}
	void mul(int x,int y)
	{
		System.out.println("multiplication is "+(x*y));
	}
	
	void div(int x,int y)
	{
		System.out.println("Division is "+(x/y));
	}
}
public class prblm17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		operations x=new operations();
		x.add(a, b);
		x.sub(a, b);
		x.mul(a, b);
		x.div(a, b);
		
		
		
	}

}
