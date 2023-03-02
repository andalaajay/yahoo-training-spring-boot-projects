package recursion;

public class RecursiveBinarySearch {
	
	public static void main(String args[])
	{
		int[] arr= {10,20,30,40,50,60,70,80};
		System.out.println(recursiveBinarySearch(arr,0,arr.length-1,50));
		System.out.println(recursiveBinarySearch(arr,0,arr.length-1,80));
	}

	private static int recursiveBinarySearch(int[] arr, int p, int r,int x) {
		int q=(p+r)/2;
		if(p>r)
		return -1;
		else if(arr[q]==x)
			return q;
		else if(arr[q]>x)
			return recursiveBinarySearch(arr,p,q-1,x);
		else
			return recursiveBinarySearch(arr,q+1,r,x);
	}

}
