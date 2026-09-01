package Lec_05;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr ={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));
		
	}
	public static int trap(int[] height) {
        int water=0;
        for(int i=0;i<height.length;i++) {
        	int lmax=height[i];
        	for(int j=0;j<=i;j++) {
        		lmax=Math.max(lmax, height[j]);
        	}
        	int rmax=height[i];
        	for(int j=i;j<height.length;j++) {
        		rmax=Math.max(rmax, height[j]);
        	}
        	
        	water=water+Math.min(lmax, rmax)-height[i];
        }
        
        return water;
    }

}
