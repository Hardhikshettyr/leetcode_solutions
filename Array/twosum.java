import java.util.*;
class Solution {
    public int[] twoSumoptimal(int[] nums, int target) {
        Map<Integer,Integer>new_map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(new_map.containsKey(complement)){
                return new int[]{new_map.get(complement),i};
            }
            new_map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    
    public int[] twoSumbruteforce(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
