package test;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int x = 0; x <= 11; x++)
			System.out.println(findSortedArrayIndex(x, arr));
		for(int x = 0; x <= 11; x++)
			System.out.println(findSortedArrayIndexRecur(x, arr, 0, arr.length-1));
	}
	static int findSortedArrayIndexRecur(int x, int[] arr, int l, int r) 
	{
		if(l > r)
			return -1;
		int m = (l+r)/2;
		if(arr[m] == x)
			return m;
		if(arr[m] < x)
			return findSortedArrayIndexRecur(x, arr, m+1, r);
		
		return findSortedArrayIndexRecur(x, arr, l, m-1);
	}
	static int findSortedArrayIndex(int x, int[] arr) 
	{
		int l = 0;
		int r = arr.length-1;
		while(l <= r) 
		{
			int m = (l+r)/2;
			
			if(arr[m] == x)
				return m;
			else if(arr[m] > x)
				r = m-1;
			else
				l = m+1;
		}
		return -1;	
	}
}