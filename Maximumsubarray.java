class Solution {

    public static int bruteforce(int arr[]) {
        int currsum;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            
        }
        return maxsum;
    }

    public static void prefixsum(int arr[]) {
        int currsum;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        return maxsum;
    }
    //brute force and prefix sum wont work due to time limit exceed erorr

    public int kadane(int[] nums) {
        int cs=nums[0];
        int ms=nums[0];

        for(int i=1;i<nums.length;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(ms,cs);
        }
        return ms;
    }
}