package pac.sort;

public class Insertionsort {
int n;
 int  arr[];
	public Insertionsort(int n, int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr=arr;
		this.n=n;
	}
	
	public void insersort() {
		
		for(int i=1;i<n;i++) {
			
			int j=i-1;
			int key=arr[i];
			
			while(j>-1&&key<arr[j])
			{
				arr[j+1]=arr[j];
				arr[j]=key;
				j--;
				
			}
				
		}
		
	}
	
	public void  print()
	{
		System.out.println("The Sorted List is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
}
