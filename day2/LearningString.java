package day2;

public class LearningString
{
	public static void main(String[] args)
	{
		String a = "Password123";
		System.out.println("a = " + a);
		
		String b = "password123";
		System.out.println("b = " + b);
		
		boolean c = a.equalsIgnoreCase(b);
		System.out.println("c = " + c);
		
		String d = "Telecommunications";
		String e = "tele";
		int f = d.indexOf(e);
		System.out.println("f = " + f);
	}
}
