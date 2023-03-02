package searcingUsingJava;

public class BinarySearch {
	
	public  static void main(String args[])
	{
		int[] arr= {3,11,21,29,41,54,61,78,110,127};
		System.out.println(binarySearch(arr,21));
		System.out.println(binarySearch(arr,78));
	}
	
	
	/*public static int binarySearch(int[] arr,int num)
	{
		int p=0,r=arr.length-1;
		//System.out.println(r);
		while(p<=r)
		{
			int q=(p+r)/2;
			//System.out.println(q);
			if(arr[q]==num)
			{
				return q;
			}
			else
			{
				if(arr[q]>num)
				{
					r=q-1;
				}
				else
				{
					p=q+1;
					//System.out.println(p);
				}
			}
		}
		return -1;
	}*/
	
	public static int binarySearch(int arr[],int num)
	{
		int p=0,r=arr.length-1;
		while(p<=r)
		{
			int q=(p+r)/2;
			if(num<arr[q])
				r=q-1;
			else if(num>arr[q])
				p=q+1;
			else
				return q;
			
		}
		return -1;
	}
}
