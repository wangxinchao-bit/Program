package dp;

public class maxSubArraySum {
	
	   public int maxSubArray(int[] nums) {
		   
		   int maxSum =nums[0];
		   int CurMaxSum = nums[0];
		   for (int i=1;i< nums.length;i++)
		   {
			   CurMaxSum = Math.max(CurMaxSum+nums[i],nums[i]);
			   maxSum = Math.max(CurMaxSum, maxSum);
		   }

		   return maxSum;
	    }

	
	
	public static void main(String[] args) {
	
		
	}
}
