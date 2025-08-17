class Solution {
    public String sortSentence(String s) {
        String[] words= s.split(" ");
        String[] result=new String[words.length];
        
        for(String word:words){
            char lc=word.charAt(word.length()-1);
            int pos=lc-'0';
            result[pos-1]=word.substring(0,word.length()-1);
            
        }
        return String.join(" ",result);
        
    }
}