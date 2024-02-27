package practice_programs;

import java.util.Scanner;

public class prblm35 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i=i+2)
		{
			int m1=a[i],m2=a[i],t1=i,t2=i;
			for(int j=i;j<n;j++)
			{
				if(m1<a[j])
				{
					m1=a[j];
					t1=j;
				}
				if(m2>a[j])
				{
					m2=a[j];
					t2=j;
				}
			}
			int t=a[i];
			a[i]=a[t1];
			a[t1]=t;
			if(i==t2)
			{
				t2=t1;
			}
			
			t=a[i+1];
			a[i+1]=a[t2];
			a[t2]=t;
			
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
