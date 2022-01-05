package sort;

import java.util.Arrays;

public class SelectionSort 
{
	public static void main(String[] args)
	{
		int arr[]= {35 , 90 , 70 , 80 , 50 , 40 , 20 , 30};
		for(int i=0;i<arr.length;i++)
		{
			int maxIndex=0;
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[maxIndex]<arr[j])
				{
					maxIndex=j;
				}
			}
			int lastIndex=arr.length-i-1;
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[lastIndex];
			arr[lastIndex]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}