package practice_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class prblm38 {

	public static void main(String[] args) {
		HashSet<String> a=new HashSet<String>();
		a.add("physics");
		a.add("maths");
		a.add("electronics");
		a.add("zebronics");
		a.add("mathematics");
		System.out.println(a);
		HashSet<String> b=new HashSet<String>();
		b.add("physics");
		b.add("maths");
		b.add("electronics");
		b.add("zebronics");
		b.add("mathematics");
		System.out.println(b);
		System.out.println("Both hashsets are equal:"+a.equals(b));
		

	}

}
