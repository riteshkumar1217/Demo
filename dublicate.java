
public class dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int co=1;
		String str="selenium is for automation is and automation we do for automation we testing";
		String[] str1 = str.split(" ");
		int count = str1.length;
		System.out.println(count);
		for(int i=0; i<count;i++)
		{
			for(int j=i+1;j<count-1;j++)
			{
				if((str1[i]).equals(str1[j]))
						{
					
					co++;
					
					System.out.println(str1[j]);
//					break;
						}
			}	
			}
	}}

	
