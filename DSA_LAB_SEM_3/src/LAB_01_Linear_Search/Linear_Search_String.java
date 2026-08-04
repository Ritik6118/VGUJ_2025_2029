package LAB_01_Linear_Search;

public class Linear_Search_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String [] arr= {"abc","def","ghi","jkl","mno"};
		String [] arr= {"ab","def","ghi","jkl","mno"};
		
//		arr[0]=new String("abc");
		String target="abc";
		
//		arr[0]=arr[0]+'c';
//		arr[0]=arr[0]+"c";
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+i);
			if(arr[i]==target) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
		
	}

}
