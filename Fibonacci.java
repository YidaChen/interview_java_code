package test;

public class Fibonacci {

	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++) 
			System.out.print(fib(i)+", ");
		
		System.out.println();
		for(int i = 0; i < 10; i++) 
			System.out.print(fib2(i)+", ");
	}
	static int fib(int n) {
		if(n <= 1) return n;
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i <= n; i++)
			arr[i] = arr[i-2] + arr[i-1];
		return arr[n];
	}
	static int fib2(int n) {
		if(n <= 1) return n;
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 2; i <= n; ++i) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}