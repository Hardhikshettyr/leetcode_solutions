import java.util.*;


class Solution {
   public int majorityElement(int[] nums) {
       int n = nums.length;
       int count = 1;
       int majority = nums[0]; 


       
       for (int i = 1; i < n; i++) {
           if (nums[i] == majority) {
               count++;
           } else {
               count--;
               if (count == 0) {
                   majority = nums[i];
                   count = 1;
               }
           }
       }


       
       count = 0;
       for (int i = 0; i < n; i++) {
           if (nums[i] == majority) {
               count++;
           }
       }


       
       if (count > n / 2)
           return majority;
       else
           return -1;
   }


   public static void main(String[] args) {
       // Hardcoded input array
       int[] nums = {2, 2, 1, 1, 2, 2, 2};


       // Create Solution object and call the method
       Solution sol = new Solution();
       int result = sol.majorityElement(nums);


       // Print result
       if (result != -1)
           System.out.println("Majority element is: " + result);
       else
           System.out.println("No majority element found.");
   }
}
