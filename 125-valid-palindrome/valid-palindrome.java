class Solution {
    public boolean isPalindrome(String s) {
        String r=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuilder sc=new StringBuilder(r);
        sc.reverse();
        String res=sc.toString();
        return res.equals(r);
        
    }
}