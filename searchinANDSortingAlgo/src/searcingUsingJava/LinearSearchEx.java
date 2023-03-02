package searcingUsingJava;

public class LinearSearchEx {
	public static void main(String args[])
	{
		int[] arr= {10,20,30,40,80,90};
		System.out.println(linerSearch(arr,80));
		System.out.println(linerSearch(arr,50));
		System.out.println(linerSearch(arr,20));
	}
	
	
	public static int linerSearch(int[] arr,int num)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				return i;
		}
		return -1;
	}
}
