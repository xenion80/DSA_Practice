class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String c:a){
            StringBuilder rev=new StringBuilder(c);
            rev.reverse();
            sb.append(rev).append(" ");
        }
        return sb.toString().trim();

        
    }
}