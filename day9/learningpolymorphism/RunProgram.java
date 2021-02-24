package day9.learningpolymorphism;

public class RunProgram
{
	public static void main(String[] args)
	{
		Animals animal1 = new Animals();
		animal1.makeSound();
		
		animal1 = new Cats();
		animal1.makeSound();
		
		Dogs dog1 = new Dogs();
		dog1.makeSound();
	}
}
