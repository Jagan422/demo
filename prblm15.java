package practice_programs;

import java.util.Scanner;
class area
{
	int l,b;
	Scanner s=new Scanner(System.in);
	public int returnArea()
	{
		System.out.println("Enter length and breadth");
		l=s.nextInt();
		b=s.nextInt();
		return l*b;
	}
}


public class prblm15 {

	public static void main(String[] args) {
		area a=new area();
		System.out.println("area of rectangle="+a.returnArea());	

	}

}
