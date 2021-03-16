package day12.studentapplication;

public class Module
{
	private String code;
	private String name;
	private Student [] students;
	private int currentNumberOfStudents=0;
	
	public Module(String code, String name, int maxNumberOfStudents)
	{
		this.code = code;
		setName(name);		// this.name = name;
		students = new Student[maxNumberOfStudents];
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Student [] getStudents()
	{
		return students;
	}
	
	public boolean addStudent(Student student)
	{
		if(currentNumberOfStudents >= students.length)
		{
			return false;
		}
		
		for(int i=0 ; i<students.length ; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getId() == student.getId())
				{
					return false;
				}
			}
		}
		
		students[currentNumberOfStudents] = student;
		currentNumberOfStudents++;
		return true;
	}
}
