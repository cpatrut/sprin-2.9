package ro.catalin.handling.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AppMain2
{

	public static void main(String[] args) 
	{
		try
		{
			openFile();
		}
		catch (FileNotFoundException e)
		{
			//this message is too vague
			System.out.println("Coul not open file");
		}
	}

	public static void openFile() throws FileNotFoundException
	{
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);
	}
}
