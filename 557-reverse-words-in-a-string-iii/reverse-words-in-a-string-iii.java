class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        String res=" ";
        for(int i=0;i<a.length;i++){
            String rev=" ";
            char[] ch=a[i].toCharArray();
            for(int j=ch.length-1;j>=0;j--){
                rev+=ch[j];
            }
            res+=rev;
        }
        return new String(res.trim());

        
    }
}