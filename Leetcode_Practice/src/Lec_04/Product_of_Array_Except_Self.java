package Lec_04;

import java.util.Arrays;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		
		int []  left=new int [arr.length];
		int [] right=new int [arr.length];
		
		int prod=1;// empty
		for(int i=0;i<left.length;i++) {
			left[i]=prod;
			prod=prod*arr[i];
		}
		
		prod=1;
		for(int i=right.length-1;i>=0;i--) {
			right[i]=prod;
			prod*=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=left[i]*right[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
