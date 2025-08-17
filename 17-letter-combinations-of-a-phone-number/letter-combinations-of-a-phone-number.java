class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return help(digits,"");
        
    }
    static List<String> help(String digits,String p){
        if(digits.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        int ch=digits.charAt(0)-'0';
        ArrayList<String> list= new ArrayList<String>();
        int start=0;int end=0;
        if(ch<7){
            start=(ch-2)*3;
            end=start+3;
        }
        else if(ch==7){
            start=15;
            end=19;
        }
        else if(ch==8){
            start=19;
            end=22;
        }
        else if(ch==9){
            start=22;
            end=26;
        }
        for(int i=start;i<end;i++){
            char c=(char)('a'+i);
            list.addAll(help(digits.substring(1),p+c));
        }
        return list;
        
    }
}