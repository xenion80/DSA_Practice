class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c=(char)(columnNumber%26+'A');
            columnNumber /=26;
            s.append(c);
            
        }
        s.reverse();
        return s.toString();
        
    }
}