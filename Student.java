// ************************************************************
// Student.java
// Name: Chris MacDonald
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// ************************************************************

import java.util.Scanner;

public class Student
{
	//declare instance data
	private String name;
	private double test1;
	private double test2;
	private static Scanner scan = new Scanner(System.in);
	
	// ---------------------------------------------
	//constructor
	// ---------------------------------------------
	public Student(String studentName)
	{
		//add body of constructor
		name = studentName;
		test1 = 0.0;
		test2 = 0.0;
	}

	// ---------------------------------------------
	//inputGrades: prompt for and read in student's grades for test1 & test2.
	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	// ---------------------------------------------
	public void inputGrades()
	{
		//add body of inputGrades
		System.out.print("Enter " + name + "'s score for test1: ");
		test1 = scan.nextDouble();
		System.out.print("Enter " + name + "'s score for test2: ");
		test2 = scan.nextDouble();
;	}

	// ---------------------------------------------
	//getAverage: compute and return the student's test average
	// ---------------------------------------------
	//add header for getAverage
	public double getAverage()
	{
		//add body of getAverage
		return (test1 + test2) / 2;
	}

	// ---------------------------------------------
	//getName: print the student's name
	// ---------------------------------------------
	//add header for printName
	public String getName()
	{
		//add body of printName
		return name;
	}
}
