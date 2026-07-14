import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicateoptimal(int[] nums) {
       Set<Integer> duplicate=new HashSet<>();
       for(int num:nums){
            if(duplicate.contains(num)){
                return true;
            }
            duplicate.add(num);
       }
       
        return false;
    }
}