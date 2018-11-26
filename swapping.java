import java.util.Scanner;

//import java.util.Scanner;
//
//public class swap {
//	void swaping(int a, int b)
//	{
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		swap s=new swap();
//		s.swaping(x, y);
//		System.out.println("hello");
//		
//
//	}
//
//}

public class swapping
{
	public void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		swapping s=new swapping();
		s.swap(x, y);
		
	}
}
