class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length;
        while(s<e){
        int mid=s+(e-s)/2;
           
                if(letters[mid]==target){
                    s=mid+1 ;
                }
                if(letters[mid]>target){
                    e=mid;
                }
                else{
                    s=mid+1;
                }
        }
        
        return letters[s%letters.length];
    }
}