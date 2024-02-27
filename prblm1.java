package practice_programs;
import java.util.Scanner;


public class prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int[] a=new int[3];
for(int i=0;i<3;i++)
{
	a[i]=s.nextInt();
}
int t=a[0];
for(int i=0;i<3;i++)
{
	if(t<a[i])
	{
		t=a[i];
	}
}
System.out.println("Greatest number="+t);

	}

}
