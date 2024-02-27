package practice_programs;


class animals
{
	
}

class dog extends animals
{
	void shout()
	{
		System.out.println("Dog will bark");
	}
}

class cat extends dog
{
	void shout()
	{
		System.out.println("cat will shout like miyaav");
	}
}


public class prblm26 {

	public static void main(String[] args) {
	 dog a=new dog();
	 dog b=new cat();
	 a.shout();
	 b.shout();

	}

}
