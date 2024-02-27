package practice_programs;
import java.util.Scanner;
public class prblm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x;
		System.out.println("Enter mark");
		x=s.nextInt();
		
		if(x<50 && x>=0)
		{
			System.out.println("Grade : Fail");
		}
		else if(x<60 && x>=50)
		{
			System.out.println("Grade : II class");
		}
		else if(x<75 && x>=60)
		{
			System.out.println("Grade : I class");
		}
		else if(x<=100 && x>=75)
		{
			System.out.println("Grade : I class with distinction");
		}
		else
		{
			System.out.println("Invalid mark ");
		}
	
		

	}

}
