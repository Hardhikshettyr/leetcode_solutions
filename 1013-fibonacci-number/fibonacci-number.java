class Solution {
    public int fib(int n) {
       if(n<=1){
        return n;
       }
       int last=1;
       int secondlast=0;
       int curr=0;
       for(int i=2;i<=n;i++){
        curr=last+secondlast;
        secondlast=last;
        last=curr;
       }
       return curr;
    }
}