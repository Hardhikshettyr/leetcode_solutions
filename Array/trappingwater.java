class Solution {
    public int trapb(int[] height) {
        int trapw=0;
        int left[]= new int[height.length];
        int right[]=new int[height.length];
        left[0]=height[0];
        right[right.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++){
            trapw+=((Math.min(left[i],right[i]))-height[i]);
        }
        return trapw;
    }

    public int trapo(int[] height) {
        int trapw=0;
        int left=0;
        int right=height.length-1;
        int leftmax=height[left];
        int rightmax=height[right];
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,height[left]);
                trapw+=leftmax-height[left];
            }else{
                right--;
                rightmax=Math.max(rightmax,height[right]);
                trapw+=rightmax-height[right];
            }
        }
        return trapw;
    }
}