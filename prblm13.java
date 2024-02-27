package practice_programs;

class shape
{
	public void draw()
	{
		
	}
	public void erase()
	{
		
	}
}

class circle extends shape
{
	int radius;
	public void draw(int r)
	{
		radius=r;
		System.out.println("circle with radius "+radius+" is created");
	}
	public void erase()
	{
		System.out.println("circle with radius "+radius+" is erased");
	}
}

class triangle extends shape
{
	int base,height;
	public void draw(int b,int h)
	{
		base=b;
		height=h;
		System.out.println("triangle with height "+height+",base "+base+" is created");
	}
	public void erase()
	{
		System.out.println("triangle with height "+height+",base "+base+" is erased");
	}
}

class square extends shape
{
	int a;
	public void draw(int x)
	{
		a=x;
		System.out.println("square with side "+a+" is created");
	}
	public void erase()
	{
		System.out.println("square with side "+a+" is erased");
	}
}



public class prblm13 {

	public static void main(String[] args) {
		circle a=new circle();
		triangle b=new triangle();
		square c=new square();
		
		a.draw(7);
		a.erase();
		System.out.println();
		b.draw(5,8);
		b.erase();
		System.out.println();
		c.draw(12);
		c.erase();

	}

}
