package it.unical.PrimeGenerator3;
import java.util.LinkedList;
import java.util.List;

public class MyMath {
	public List<Integer> primeNumbersGenerator(int n)
	{
		List<Integer> primeNumbers = new LinkedList<Integer>();
		if(n >= 2)	{
			primeNumbers.add(2);
			
		}
		for(int i = 3; i <= n; i+= 2) {
			if(isPrime(i))	{
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
	
	public boolean isPrime(int number)	{
		if(number < 2)	{
			return false;
		}
		for(int i = 0 ; i *i < number; i++)	{
			if(number % 2 == 0 )	{
				return false;
			}
		}
		
		return true;
	}
}
