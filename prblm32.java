package practice_programs;

import java.util.Scanner;

public class prblm32 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,n;
		System.out.println("Enter 2 numbers for division");
		m=s.nextInt();
		n=s.nextInt();
		
		if(n!=0)
		{
			System.out.println("Result is "+(m/n));
		}
		else
		{
			throw new ArithmeticException("Division by zero.. Give valid inputs");
		}
		

	}

}
