class Solution {
    public String reversePrefix(String word, char ch) {
        
        int ind=0;
            for(int i=0;i<word.length();i++){
                if((word.charAt(i))==(ch)){
                    ind=i;
                    break;

                }

            }
            StringBuilder sc=new StringBuilder(word.substring(0,ind+1));
            sc.reverse();
            sc.append(word.substring(ind+1,word.length()));
            return sc.toString();

        
    }
}