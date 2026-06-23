class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=2;
        
        int cm=2;
        int n=nums.length;
        if (n <= 2) return n;

        while(cm<n){
           if (nums[cm] != nums[officer - 2]) {
                nums[officer] = nums[cm];
                officer++;
            }
            cm++;
        }
        return officer;
    }
}