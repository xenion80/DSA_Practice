class Solution {
    public int heightChecker(int[] heights) {
        int [] temp=heights.clone();
        int[] sort=insertion(heights);
        int count=0;
        int i=0;
        while( i<heights.length){
            if(sort[i]==temp[i]){
                i++;
               
            }else{
                count++;
                i++;
            }
        }
        return count;

        
    }
    public int[] insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}