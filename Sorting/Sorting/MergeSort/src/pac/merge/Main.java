package pac.merge;
import java.util.Arrays;
public class Main {
	public static int[] merge(int arr1[],int arr2[])
	{
		int combined[]=new int[arr1.length+arr2.length];
		int index=0;
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[i])
			{
				combined[index]=arr1[i];
				i++;
				index++;
			}
			else {
				
				combined[index]=arr2[i];
				i++;
				index++;
			}
		}
	
			while(i<arr1.length)
		{
			combined[index]=arr1[i];
			index++;
			i++;
		}
		while(j<arr2.length)
		{
			combined[index]=arr2[j];
					j++;
			index++;
		}
		return combined;
	}
	
	public static int[] mergesort(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		int midindex=arr.length/2;
		int left[]=mergesort(Arrays.copyOfRange(arr, 0, midindex));
		int right[]=mergesort(Arrays.copyOfRange(arr, midindex, arr.length));
		return  merge(left,right);
	}
	public static void main(String[] args) {
		int arr[]= {2,4,5,30,25};
	System.out.println("Before");
	System.out.println(Arrays.toString(arr));
	
	System.out.println("After");
	System.out.println(Arrays.toString(mergesort(arr)));
	
	}

}
