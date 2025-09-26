class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int i=0,j=0;
        StringBuilder sc=new StringBuilder();
        
        while(i<a||j<b){
            if(i<a){
            sc.append(word1.charAt(i++));}
            if(j<b){
            sc.append(word2.charAt(j++));}
        }
        return sc.toString();
        
    }
}