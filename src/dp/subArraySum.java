package dp;

import java.util.HashSet;

public class subArraySum {
	
    public boolean checkSubarraySum(int[] nums, int k) {
        int N = nums.length, cache = 0;
        int[] sum = new int[N+1];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            sum[i+1] = sum[i] + nums[i];
            int res = k == 0 ? sum[i+1] : sum[i+1] % k;
            if (set.contains(res)) return true;
            set.add(cache);
            cache = res;
        }
               
        return false;
    }

	public static void main(String[] args) {
		
		subArraySum eg1 = new subArraySum();
		int []array= {23,2,4,6,7};
		boolean result = eg1.checkSubarraySum(array, 6);
		System.out.println(result);

	}

	
	
}
