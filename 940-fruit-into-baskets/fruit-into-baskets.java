class Solution {
    public int totalFruit(int[] fruits) {
        
        int high=0,low=0,n=fruits.length,res=-1;
        Map<Integer,Integer> freq=new HashMap<>();
        for(high=0;high<n;high++){
            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);
            while(freq.size()>2){
                int fr=fruits[low];
                freq.put(fr,freq.getOrDefault(fr,0)-1);
                if(freq.get(fr)==0){
                    freq.remove(fr);
                    
                }
                low++;
                

            }
            int len=high-low+1;
                res=Math.max(res,len);

        }
        return res;
    }
}