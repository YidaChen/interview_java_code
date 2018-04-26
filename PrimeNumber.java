package test;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 100; i++)
			if(isPrime(i))
				System.out.println(i+" ");
	}
	static boolean isPrime(int n) {
		if(n < 2) return false;
		
		int root = (int) Math.sqrt(n);
		for(int i = 2; i <= root; i++) 
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
}