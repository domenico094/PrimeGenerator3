package it.unical.PrimeGenerator3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
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
		assertEquals(Arrays.asList(2,3,5,7),math.primeNumbersGenerator(7));
		
	}
	
	@Test 
	public void isPrime()
	{
		assertTrue(math.isPrime(7));
		assertFalse(math.isPrime(8));
	}
}
