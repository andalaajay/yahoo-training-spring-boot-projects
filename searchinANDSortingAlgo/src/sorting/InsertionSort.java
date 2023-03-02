package sorting;

public class InsertionSort {
	
	public static void main(String args[])
	{
		int[] arr= insertionSort(new int[]{25,20,3,19,8,18});
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	
	public static int[] insertionSort(int[] arr)
	{
		
		for(int i=1;i<arr.length;i++)
		{
			int element=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>element)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		return arr;
	}
}
