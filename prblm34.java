package practice_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prblm34 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6};
		int n,x;
		System.out.println("Enter element and position");
		x=s.nextInt();
		n=s.nextInt();
		
		List<Integer> b=new  ArrayList<>();
		for(int i=0;i<6;i++)
		{
			if(i==n-1)
			{
				b.add(x);
			}
			b.add(a[i]);
		}
		int c[]=new int[a.length+1];
		for(int i=0;i<=a.length;i++)
		{
			c[i]=b.get(i);
		}
		System.out.println("Before insertion");
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");}
		System.out.println();
		System.out.println("After Insertion");
		
		for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");}

	}

}
