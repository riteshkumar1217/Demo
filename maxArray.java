import java.util.Scanner;

public class maxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int max=arr[0];
		for(int i=0;i<size;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int a:arr)
			
		System.out.println(a);
		System.out.println(max);

	}
	

}
