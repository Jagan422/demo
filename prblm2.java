package practice_programs;
import java.util.Scanner;


public class prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a=new String[5];
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
		a[i]=s.next();}
		int n=a[0].length();
		int j=0;
	     for(int i=0;i<5;i++)
		{
			if(a[i].length()>n)
			{
				n=a[i].length();
				j=i;
			}
		}
		
			System.out.println("Largest string is "+a[j]);
		
		
	}

}
