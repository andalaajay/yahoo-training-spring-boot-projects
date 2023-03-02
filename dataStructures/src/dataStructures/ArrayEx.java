package dataStructures;

public class ArrayEx {
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		arr=addingBetweenArray(arr,6,2);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] addingBetweenArray(int arr[],int ele,int pos)
	{
		int len=arr.length+1;
		int temp[]=new int[len];
		for(int i=0;i<=pos;i++)
		{
			if(i==pos)
			{
			temp[i]=ele;
			continue;
			}
			temp[i]=arr[i];
		}
		for(int i=pos+1,j=pos;i<len;i++,j++)
			temp[i]=arr[j];
		return temp;
	}

}



//3
//
//
//It is because the address has to point to the right element in the array. Let us assume the below array:
//
//let arr = [10, 20, 40, 60]; 
//Let us now consider the start of the address being 12 and the size of the element be 4 bytes.
//
//address of arr[0] = 12 + (0 * 4) => 12
//address of arr[1] = 12 + (1 * 4) => 16
//address of arr[2] = 12 + (2 * 4) => 20
//address of arr[3] = 12 + (3 * 4) => 24
//If it was not zero-based, technically our first element address in the array would be 16 which is wrong as it's location is 12.
