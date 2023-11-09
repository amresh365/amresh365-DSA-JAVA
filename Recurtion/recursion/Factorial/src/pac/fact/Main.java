package pac.fact;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int n;
	Scanner myin=new Scanner(System.in);
	
	System.out.println("Please inter a number");
	n=myin.nextInt();
	
	
	
 int ans=	fact(n);
 System.out.println("The Factorial is"+ans);
}

public static int fact( int n)
{
	
	if(n==1)
	{
		return n;
	}
	
	else
		return n*fact(n-1);
	
}


}
