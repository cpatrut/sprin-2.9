package ro.catalin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class AppMain2
{

	public static void main(String[] args)
	{
		File file = new File("test.txt");


		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{

		}
		catch (FileNotFoundException e)
		{
			System.out.println("can not fin file");
		}
		catch (IOException e)
		{
			System.out.println("unable to read the file");
		}


	}

}