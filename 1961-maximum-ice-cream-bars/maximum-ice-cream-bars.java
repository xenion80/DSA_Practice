class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int rem=coins;
        int max=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=rem){
                max++;
                rem=rem-costs[i];

            }
        }
        return max;
    }
}