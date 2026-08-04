package Lec_01;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";  // --> 1000
		
		String s2="ab";  //--> 1050
		s2+="c"; // new string will get created at a new location  -->20000 
		
		String s3="abc";   // this string will not get seprate address as this is allready initialized in pool
		
		String s4=new String("abc");
		
		
		String s5="abc";
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1==s4);
		System.out.println(s1==s5);
		
	}

}
