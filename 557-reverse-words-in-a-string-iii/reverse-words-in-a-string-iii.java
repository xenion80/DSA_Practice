class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        String res=" ";
        for(int i=0;i<a.length;i++){
            String rev=" ";
            char[] ch=a[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                rev=ch[j]+rev;
            }
            res+=rev;
        }
        return new String(res.trim());

        
    }
}