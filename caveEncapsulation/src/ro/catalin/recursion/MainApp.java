package ro.catalin.recursion;

public class MainApp
{
	public static void main(String[] args)
	{
		int value = 4;
		System.out.println(calculate(value));
		System.out.println(value);
	}

	private static int calculate(int value)
	{
		System.out.println(value);
		if (value == 1)
		{
			return 1;
		}
			return value*calculate(value - 1);
		
	}
}
