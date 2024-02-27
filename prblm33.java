package practice_programs;

import java.util.Scanner;

public class prblm33 {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 6 values");
		for(int i=0;i<6;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the value to remove from the array");
		int n,m=0,x=6;
		n=s.nextInt();
		for(int i=0;i<x;i++)
		{
			if(a[i]==n)
			{
				System.out.println("Element "+n+ " removed from the array");
				m=1;
				x--;
				for(int j=i;j<x;j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		if(m==0)
		{
			System.out.println("Element "+n+ " is not present in the array");
		}
		for(int i=0;i<x;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
