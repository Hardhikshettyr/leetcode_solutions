class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return n;
        }
        if(n==1 || n==2){
            return 1;
        }
        int last=0;
        int secondlast=1;
        int thirdlast=1;

        int curr=0;

        for(int i=3;i<=n;i++){
            curr=last+secondlast+thirdlast;
            last=secondlast;
            secondlast=thirdlast;
            thirdlast=curr;
        }

        return curr;
    }
}