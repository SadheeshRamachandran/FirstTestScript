package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class First_Test_Class extends Base_Class {
	@Test
	public void First_Test_Case_Method()
	{
		String str = "Hello World";
		Assert.assertEquals(str, "Hello World");
		System.out.println("hello world");
	}
}
