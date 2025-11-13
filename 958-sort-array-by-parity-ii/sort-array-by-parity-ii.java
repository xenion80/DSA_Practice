class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1;
        int n = nums.length;

        while (even < n && odd < n) {
            if (nums[even] % 2 == 1) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                odd += 2;
            } else {
                even += 2;
            }

        }
            return nums;
        
    }
}