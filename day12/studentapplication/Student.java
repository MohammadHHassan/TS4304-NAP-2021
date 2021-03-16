package day12.studentapplication;

public class Student
{
	private int id;
	private String name;
	private int age;
	private static int numberOfStudents=0;
	
	public Student(String name, int age)
	{
		setName(name);		// this.name = name;
		setAge(age);		// this.age = age;
		numberOfStudents++;
		this.id = numberOfStudents;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
}
