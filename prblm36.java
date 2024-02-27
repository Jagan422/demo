package practice_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class prblm36 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>(6);
		Scanner s=new Scanner(System.in);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+" ");
		}
		

	}

}
