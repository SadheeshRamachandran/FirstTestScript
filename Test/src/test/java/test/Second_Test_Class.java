package test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Second_Test_Class {

	
	@Test
	public void Second_Test_Case_Method()
	{
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("First number");
			int first = scanner.nextInt();
			System.out.println("Second number");
			int second = scanner.nextInt();
			int third = first+second;
			System.out.println("The Addition of two number is : "+ third);
		}
		
	}
}
