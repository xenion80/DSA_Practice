class Solution {
    public int mySqrt(int x) {
        long s=1;
        long e=x;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid==(long)x){
                return (int)Math.round(mid);
            }
            else if(mid*mid<(long)x){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return (int)Math.round(e);
    }
}