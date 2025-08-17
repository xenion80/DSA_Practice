class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,(s.length())/2);
        String b=s.substring((s.length())/2);
        int count=0;
        int count1=0;
        for(char vow:a.toCharArray()){
            if(vowel(vow)){
                    count++;
            }
        }
        for(char vo:b.toCharArray()){
            if(vowel(vo)){
                    count1++;
            }
        }
        return count==count1;
        
    }
    static boolean vowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}