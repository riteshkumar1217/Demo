import java.lang.reflect.Array;
import java.util.Arrays;

public class stringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is ritesh kumar";
		String [] arr=str.split(" ");
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			if(arr[i].equals("is"))
			{
				arr[i]="hello";
			}
			System.out.println(arr[i]+" ");
		
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
