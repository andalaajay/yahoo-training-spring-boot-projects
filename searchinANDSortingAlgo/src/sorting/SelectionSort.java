package sorting;

public class SelectionSort {
	
	public static void main(String args[])
	{
		int[] arr=selectionSort(new int[] {1,4,2,0,5});
		for(int i:arr)
			System.out.println(i);
	}
	
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr;
	}
}
