class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return ispallindrone(s,left+1,right)||ispallindrone(s,left,right-1);
            }
            left++;
            right--;
        }
     return true;   
    }
    public boolean ispallindrone(String s, int left,int right){
         while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
                left++;
                right--;
         }
         return true;

    }
}