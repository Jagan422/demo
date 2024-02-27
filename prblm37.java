package practice_programs;

import java.util.LinkedList;
import java.util.Scanner;

public class prblm37 {
	public static void main(String[] args) {
	LinkedList<Integer> a=new LinkedList<Integer>();
	Scanner s=new Scanner(System.in); 
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(100);
	a.add(200);
	a.add(600);
	a.add(500);
	a.add(300);
	int n;
	
	System.out.println(a);
	System.out.println("First occurence of 300 is at "+(a.indexOf(300)+1));
	System.out.println("Last occurence of 200 is at "+(a.lastIndexOf(200)+1));
	
	

}
}
