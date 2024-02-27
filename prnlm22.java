package practice_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class prnlm22 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("item1");
		a.add("item2");
		a.add("item3");
		Iterator itr=a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedList<String> b=new LinkedList<String>();
		b.add("1");
		b.add("2");
		b.add("3");
		System.out.println(b);
		
		Vector<String> c=new Vector<String>();
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c);
		
		Stack<String> d=new Stack<String>();
		d.push("ex1");
		d.push("ex2");
		d.push("ex3");
		d.push("ex4");
		d.pop();
		System.out.println(d);
		
		PriorityQueue<String> e=new PriorityQueue<String>();
		e.add("1");
		e.add("2");
		e.add("3");
		e.add("4");
		System.out.println(e);
		e.remove();
		System.out.println(e);
		e.remove();
		System.out.println(e);
		

	}

}
