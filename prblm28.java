package practice_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class prblm28 {

	public static void main(String[] args) throws IOException {
		FileOutputStream f;
		PrintStream p;
		f=new FileOutputStream("D:\\myfile.txt");
		p=new PrintStream(f);
		p.println("word1");
		p.println("word2");
		p.println("word3");
		p.println("word4");
		p.close();
		
		FileInputStream fin=new FileInputStream("D:\\New Mail ID Don't Delete.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}

	}

}
