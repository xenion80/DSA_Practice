class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff= Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int total=nums[i]+nums[l]+nums[r];
                int d=Math.abs(target-total);
                if(diff>d){
                    diff=d;
                    result=total;
                }
                if(total==target){
                    return result;
                }
                else if(total<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;
    }
}