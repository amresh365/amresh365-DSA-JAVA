package pac.hash;

import java.util.HashMap;
	
public class Main {
public static void main(String[] args) {
	int arr1[]= {2,3,2,4,56};
	int arr2[]= {9,10,3,8,0};
	System.out.println(IntInCommon(arr1,arr2));
}

public  static boolean IntInCommon(int array1[],int array2[])
{
	HashMap<Integer,String>myhashmap=new HashMap<>();

	for(int i:array1)
	{
		 myhashmap.put(i,"true");
	}
	
	for(int j:array2)
	{
		if(myhashmap.get(j)!=null)
		{
			return true;
		}
	}
	return false;
}
}

