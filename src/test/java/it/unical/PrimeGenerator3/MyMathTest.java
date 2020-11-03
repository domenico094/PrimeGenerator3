package it.unical.PrimeGenerator3;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	
	private static MyMath math;
	
	@BeforeClass
	public static void prepare()	{
		math = new MyMath();
	}
	
	@Test
	public void primeNumbersGeneratorWorks()	{
		assertEquals(new LinkedList<Integer>(),math.primeNumbersGenerator(1));
	}
}
