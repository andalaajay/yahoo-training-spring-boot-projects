package recursion;

public class RecursiveLinerSearch {
	
	public static void main(String args[])
	{
		int[] arr= {10,20,30,40,50,60};
		System.out.println(recursiveLinearSearch(0,arr,100));
	}
	
	public static int recursiveLinearSearch(int index,int[] arr,int x)
	{
		if(index>arr.length-1)
			return -1;
		else if(arr[index]==x)
			return index;
		else
			return recursiveLinearSearch(index+1,arr,x);
	}

}
