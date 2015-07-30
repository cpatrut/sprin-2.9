package reading.filw.with.file.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class AppMain
{

	public static void main(String[] args)
	{
		File file = new File("test.txt");
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			
			fr.close();
			br.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("file not found: " + file.toString());
		}
		catch (IOException e)
		{
			System.out.println("Unable to read the file:" + file.toString());
		}
		finally {
			System.out.println("finasd");
		}

	}

}
