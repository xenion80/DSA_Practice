class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int count=0;
        while(count<s1.length()&&count<s2.length()){
            if(s1.charAt(count)==s2.charAt(count)){
                count++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,count);
        
    }
}