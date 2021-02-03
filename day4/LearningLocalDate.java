package day4;

import java.time.LocalDate;

public class LearningLocalDate
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();
		
		System.out.println(now);
		System.out.println("Year = " + now.getYear());
		System.out.println("Month = " + now.getMonth());
		System.out.println("Month value = " + now.getMonthValue());
		System.out.println("Day of the month = " + now.getDayOfMonth());
		System.out.println("Day of the year = " + now.getDayOfYear());
		System.out.println("Day of the week = " + now.getDayOfWeek());
	}
}
