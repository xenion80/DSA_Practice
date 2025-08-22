class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.charAt(0)!=typed.charAt(0)){
            return false;
        }
        if(name.length()>typed.length()){
            return false;
        }
        int i=1;
        int j=1;
        while(i<typed.length()){
            if(j<name.length()&&name.charAt(j)==typed.charAt(i)){
                j++;
                i++;
            }
            else if(typed.charAt(i)==typed.charAt(i-1)){
                i++;
            }
            else{
                return false;
            }
        }
        return j==name.length();
    }
}