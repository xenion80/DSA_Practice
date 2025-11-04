class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=squareno(slow);
            fast=squareno(squareno(fast));

        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;

        
    }
    private int squareno(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
    }
}