package pac.selection;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
	     System.out.println("Enter The Alement");
		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();
		}
		
		SelectionSort ssrt=new SelectionSort(n,arr);
		ssrt.selectionsort();
		ssrt.printsort();
	   
	   
}
}
