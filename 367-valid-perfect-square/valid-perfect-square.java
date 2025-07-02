class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;}
       
        long s=0; long e=num/2;
        while(s<=e){
             
        
            long mid=s+(e-s)/2;
            long pow=mid*mid;
            if(pow==num){
                return true;
            }
            else if(pow<num){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}