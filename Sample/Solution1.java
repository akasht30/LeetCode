import java.util.*;
class Solution1 {
	public static int[] runningSum(int[] nums) {
        
        int[] sum=new int[nums.length];
		
		sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           
		   sum[i]=sum[i-1]+nums[i];
		}

        return sum;

    }

	public static void main(String[] args ){

		int[] ar={1,2,3,4,5};
		
		int res[]=runningSum(ar);
		for(int i=0;i<res.length;i++) {
			System.out.print("{"+res[i]+","+"}");

		}

	}
}
