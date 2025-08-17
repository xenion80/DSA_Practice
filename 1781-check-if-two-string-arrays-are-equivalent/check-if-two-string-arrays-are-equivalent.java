class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s= String.join("",word1);
        String t=String.join("",word2);
        return s.equals(t);
        
    }
}