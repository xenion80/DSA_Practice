class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0;
       
        List<List<Integer>> result=new ArrayList<>();  
        Arrays.sort(nums);      
        for( i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            int s=-nums[i];

            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while(l<r){
                int sum=nums[l]+nums[r];
                if(s==sum){
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                 while(l<nums.length&&nums[l]==nums[l-1]){
                l++;
            }
                while(r>=0&&nums[r]==nums[r+1]){
                r--;
            }
                }
            else if(sum<s){
                l++;
            }else{
                r--;
            }
                
                }

                
            }
           
            
            
        
        return result;
    }
}