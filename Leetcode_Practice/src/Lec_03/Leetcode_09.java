package Lec_03;

public class Leetcode_09 {
	public static void main(String [] args) {
		int n=-101;
		System.out.println(isPalindrome(n));
	}
	public static  boolean isPalindrome(int n) {
		if(n==0) {
			return true;
		}
		else if(n<0 ||  n%10==0){
			return false;
		}
		int temp=n;
		int rev=0;
		while(temp!=0) {
			rev*=10;
			int rem = temp%10;
			rev+=rem;
			temp/=10;
		}
		return n==rev;
	}
}	
