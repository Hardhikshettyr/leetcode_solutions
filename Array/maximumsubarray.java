public class maximumsubarray {
    class Solution {
    public int maxSubArray(int[] nums) {
        int cursum=0;
       int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cursum=Math.max(cursum+nums[i], nums[i]);
            maxsum=Math.max(maxsum,cursum);
        }
        return maxsum; 
    }
}
}
