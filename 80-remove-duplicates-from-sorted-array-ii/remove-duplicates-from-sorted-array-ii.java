class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0;
        int result=2;
        int cm=2;
        int n=nums.length;
        if (n <= 2) return n;

        while(cm<n){
            if(nums[cm]==nums[officer]){
                cm++;
                continue;
            }
            nums[officer+2]=nums[cm];
            officer++;
            result++;
            cm++;
        }
        return result;
    }
}