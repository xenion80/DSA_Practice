class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int rem=0;
        int flag=x;

        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
            
            
        }
        return flag==rev;
    }
}