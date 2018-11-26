//Word count in java


//public class stringwordcount {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s ="dsjfjdskfj";
//		char []a=s.toCharArray();
//		System.out.println(a);
//		System.out.println(s.length());
//		int count=0 ;
//		for(int i = 0;i<=s.length()-1;i++)
//			
//		{
//			System.out.println(a[i]);
//			if(a.equals('d'))
//			count=count+1;
//			
//		}
//		System.out.println(count);
//	}
//
//}

//Char search in string

//public class fetchChar{
//	public static void main(String[] args) {
//		String str = "First stirng";
//        for(int i=0;i<str.length()-1;i++)
//        {
//            // System.out.println(i);
//            if('i'==str.charAt(i))
//            {
//                System.out.println("Fetched");
//            
//            }
//            // else
//            // {
//            //   System.out.println("not Fetched");  
//            // }
//        }
//	}
//}

//Ignone case
//public class Ignorecase{
//	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "He";
//		String s3 = "hello";
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equalsIgnoreCase(s3));
//	}
//	
//}


////Concate
//public class concat{
//	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "He";
//		String s3 = "hello";
//		System.out.println(s1.concat(s2).concat("helllll"));
//// 		System.out.println(s1.equalsIgnoreCase(s3));
//	}
//	
//}

// Replace
//public class Ignorecase{
//	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "He";
//		String s3 = "hello";
//// 		System.out.println(s1.replace('e','d');
//        System.out.println(s1.replace('e', 'K'));
//// 		System.out.println(s1.equalsIgnoreCase(s3));
//
//	}
//	
//}




//String class

class stringExam{
	public static void main(String[] args) {
		String str = "First stirng";
		char[] chararry ={'h','s','d','g'};
		String str1 = new String(chararry);
		String str2 = new String("This is the third st");
//		stringExam s =new stringExam();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
}
