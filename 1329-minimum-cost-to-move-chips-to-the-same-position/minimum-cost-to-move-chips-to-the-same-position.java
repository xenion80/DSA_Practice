class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0;
        int even=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2!=0){
                odd++;
            }
            else{
                even++;
            }
            
        }
        if(odd<even){
            return odd;
        }
        return even;
    
    }
}