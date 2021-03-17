package day13.datastructures;

import java.util.ArrayList;

public class LearningArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Mohammad");
		nameList.add("Haji");
		nameList.add("Hassan");
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		nameList.add(0, "Haji");
		nameList.add(2, "Bin");
		nameList.add("Bin Haji Hashim");
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		nameList.remove(5);
		nameList.remove(2);
		nameList.remove(0);
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		System.out.println();
		System.out.println(nameList.get(0));
		System.out.println("Size of array list: " + nameList.size());
	}
}
