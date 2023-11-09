package pac.sort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number of Alement:");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
	     
		System.out.println("Enter The Alement:");
		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();
		}
		
		Insertionsort inssrt=new Insertionsort(n,arr);
		inssrt.insersort();
		inssrt.print();
		
	}

}
