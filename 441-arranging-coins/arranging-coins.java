class Solution {
    public int arrangeCoins(int n) {
        long s=1;
        long e=n;
        long ans=0;
        while(s<=e){
            long mid=s+(e-s)/2;
            long coincount=(mid*(mid+1))/2;
            if(coincount<=n){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return (int)ans;

    }
}