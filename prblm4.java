package practice_programs;
import java.util.Scanner;
public class prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n,p;
		double r;
		p=s.nextInt();
		n=s.nextInt();
		r=s.nextDouble();
		System.out.println("Simple interest="+f3(p,n,r));
		
		
	}
	static double f3(int p,int n,double r)
	{
		return p*n*r/100;
	}

}
