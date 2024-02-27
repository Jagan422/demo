package practice_programs;

class stringUtilities
{
	public void stringCompare(String a,String b)
	{
		if(a==b)
		{
			System.out.println("Given strings are equal");
		}
		else
		{
			System.out.println("Given strings are not equal");
		}
	}
	
	public void stringLength(String a)
	{
		System.out.println("Length of the string is "+a.length());
	}
	
	public void stringtoUpper(String a)
	{
		System.out.println(a.toUpperCase());
	}
}

public class prblm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringUtilities a=new stringUtilities();
		a.stringCompare("abc", "abc");
		a.stringLength("abc");
		a.stringtoUpper("abc");
				

	}

}
