package day5;

public class LearningMethod3
{
	public static void main(String[] args)
	{
		displayName("Mohammad");
		
		System.out.println(printName("Haji Hassan"));
	}
	
	public static String printName(String name)
	{
		String text = "My name is " + name;
		return text;
	}
	
	public static void displayName(String name)
	{
		System.out.println("My name is " + name);
	}
}
