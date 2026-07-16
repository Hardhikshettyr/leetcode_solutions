class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0, end=arr.length-1;
        while(low<=end){
            int mid=(low+end)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                end=mid-1;
            }
        }
        return low;
    }
}