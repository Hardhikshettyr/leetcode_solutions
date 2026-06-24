class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int ld=0;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x>0){
            ld=x%10;
            rev=(rev*10)+ld;
            x=x/10;
        }
        return original==rev;
    }  
}