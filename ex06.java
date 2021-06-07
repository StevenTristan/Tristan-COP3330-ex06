/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Steven Tristan
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class example6
{
	public static void main ()
	{
		ex6();
	}

	public static void ex6()
	{
		System.out.println("What is your current age?");
		Scanner s = new Scanner(System.in);
		int current = s.nextInt();
		System.out.println("At what age would you like to retire?");
		int retire = s.nextInt();
		int yearsleft = retire - current;
		Date time = new Date();
		Calendar newcal = new GregorianCalendar();
		newcal.setTime(time);
		int year = newcal.get(Calendar.YEAR);

		System.out.println("You have " + yearsleft + " years left until you can retire in " + (year + yearsleft));
	}
}
