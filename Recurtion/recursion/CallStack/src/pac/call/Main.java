package pac.call;

public class Main {
public static void main(String[] args) {
	M1();
}
	
public static void M1()
{
	M2();
	System.out.println("one");

}

public static void M2()
{
	M3();
	System.out.println("two");
}

public static void M3()
{
	M4();
	System.out.println("three");
}
public static void M4()
{
	System.out.println("four");
}



}
