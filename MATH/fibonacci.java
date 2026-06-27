class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }

        int secondlast=0;
        int last=1;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=secondlast+last;
            secondlast=last;
            last=curr;
        }
        return curr;
    }
}