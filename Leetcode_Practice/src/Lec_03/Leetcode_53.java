package Lec_03;

public class Leetcode_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-1000,-2,-3,-4,-100,-5,-6};
		int a=maxSubarray(arr);
		System.out.println(a);
	}

	private static int maxSubarray(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		int max=Integer.MIN_VALUE;		//		{1,2,3,-40,  5,6}
		for(int i=0;i<arr.length;i++) {//        1 3 6 -36 0 5 11  
 			sum+=arr[i];
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		
		return max;
	}
	

}
