package pac.sort;

import java.util.Arrays;

public class BubbleSort {
  
	int n;
	int arr[];
	public BubbleSort(int[] arr, int n) {
		// TODO Auto-generated constructor stub
		this.arr=arr;
		this.n=n;
	}

	public void bubblesort()
	{
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			
			}
		}
		
	}
	
	public void print() {
		System.out.println("The Sorted Alement is:");
		for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
		}
	}
}
