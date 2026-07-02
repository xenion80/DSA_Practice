class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr=s.toCharArray();
        int low=0,high=0,res=Integer.MIN_VALUE,n=arr.length;
        Map<Character,Integer> freq=new HashMap<>();
        for(high=0;high<n;high++){
            int k=high-low+1;
            freq.put(arr[high],freq.getOrDefault(arr[high],0)+1);
            while(freq.size()<k){
                freq.put(arr[low],freq.getOrDefault(arr[low],0)-1);
                if(freq.get(arr[low])==0){
                    freq.remove(arr[low]);
                }
                low++;
                k=high-low+1;

            }
            int len=high-low+1;
            res=Math.max(res,len);
        }
        if(res==Integer.MIN_VALUE)return 0;
        return res;
        
    }
}