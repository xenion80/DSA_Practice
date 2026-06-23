class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0;
        int result=1;
        int cm=1;
        int n=nums.length;
        while(cm<n){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            nums[officer+1]=nums[cm];
            officer++;
            result++;
            cm++;
        }
        return result;
        
    }
}