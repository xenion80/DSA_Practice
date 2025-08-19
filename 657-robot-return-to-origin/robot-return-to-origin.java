class Solution {
    public boolean judgeCircle(String moves) {
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        char[] ch=moves.toCharArray();
        for(char c:ch){
            if(c=='U'){
                u++;
            }
            else if(c=='D'){
                d++;
            }
            else if(c=='L'){
                l++;
            }
            else if(c=='R'){
                r++;
            }
        }
        return l==r&&u==d;
        
    }
}