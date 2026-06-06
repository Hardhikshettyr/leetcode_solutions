public class Solution {

    public static int bruteforce(int arr[]) {
        int cursum;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                cursum=0;
                for(int k=i;k<=j;k++){
                    cursum+=arr[k];
                }
                if(cursum>maxsum){
                    maxsum=cursum;
                }
            }
        }
        return maxsum;
    }

    public static int prefixsum(int arr[]) {
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                cursum=i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<cursum){
                maxsum=cursum;
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


    public static void main(String [] args){
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(prefixsum(a));
    }
}

