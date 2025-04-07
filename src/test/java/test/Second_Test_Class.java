package test;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Second_Test_Class extends Base_Class {
	@Test
	public void Second_Test_Case_Method()
	{
		
		int first = 10;
		int second = 15;
		int third = first+second;
		int sum = 25;
		Assert.assertEquals(sum,third);
		System.out.println("The Addition of two number is : "+ third);
		
	}
}
