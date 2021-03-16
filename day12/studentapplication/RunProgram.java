package day12.studentapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Module module1 = new Module("TS4304", "Network Application Programming", 3);
		Student student1 = new Student("Mohammad", 18);
		Student student2 = new Student("Bin", 19);
		Student student3 = new Student("Haji", 20);
		Student student4 = new Student("Hassan", 21);
		
		System.out.println("Module: " + module1.getCode() + " " + module1.getName());
		
		printAddingStudent(module1, student1);
		printAddingStudent(module1, student2);
		printAddingStudent(module1, student3);
		printAddingStudent(module1, student4);
	}
	
	public static void printAddingStudent(Module module, Student student)
	{
		System.out.println("Adding student: " + student.getId() + ". " + student.getName());
		System.out.println("Successful? " + module.addStudent(student));
	}
}
