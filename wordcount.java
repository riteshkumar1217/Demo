
public class wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is ritesh kumar";
		String [] wa =str.split(" ");
		int size=wa.length;
		int count=0;
		for (int i=0;i<size;i++){
//			System.out.println(wa[i]);
			for(int j=i+1;j<size-1;j++)
			{
//				System.out.println(wa[j+1]);
				
				if(wa[i].equals(wa[j+1]))
				{
					count=count+1;
					System.out.println(count);
				}
			}
		}
		

	}

}
