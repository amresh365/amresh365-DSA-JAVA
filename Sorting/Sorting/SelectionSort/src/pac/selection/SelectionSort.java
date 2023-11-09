package pac.selection;

public class SelectionSort {
      int arr[];
      int n;

	
	public SelectionSort(int n, int[] arr) {
		// TODO Auto-generated constructor stub
		this.n=n;
		this.arr=arr;
	}

	public void selectionsort()
	{
     
		for(int i=0;i<n;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					minIndex=j;
				}	
				
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
    public void printsort()
    {
    	System.out.println("The sorted Alement Is:");
    	for(int i=0;i<n;i++)
    	{
    		System.out.println(arr[i]);
    		
    	}
    }
}
