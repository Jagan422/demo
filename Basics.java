package practice_programs;
import java.util.Scanner;
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello world");
int a=10,b=3;
float c=3.12f;
char d='a';
System.out.println(c);
System.out.println(d);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a>b);
System.out.println(!(a==0));
String e="MUKESH";
Scanner s=new Scanner(System.in);
/*e=s.next();*/
System.out.println("your name="+e);
for(int i=0;i<2;i++)
{
	System.out.println("your name="+e);
}
drawLine();
System.out.println("Name        city");
drawLine();
System.out.println("Mukesh     karaikudi");
System.out.println("Arun       chennai");
drawLine();

	}
	
	static void drawLine()
	{
		System.out.println("---------------------------");

	}

}
