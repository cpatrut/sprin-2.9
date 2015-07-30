package ro.catalin.reading.files.using.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppMain
{

	public static void main(String[] args) throws FileNotFoundException
	{
		String fileName="example.txt";
		
		File file=new File(fileName);
		Scanner in=new Scanner(file);
		int value=in.nextInt();
		in.nextLine();
		System.out.println("read value:"+value);
		int count=2;
		while(in.hasNextLine()){
			
			String line=in.nextLine();

			System.out.println(count+":"+line);
			count++;
		}
		
		
	}

}
