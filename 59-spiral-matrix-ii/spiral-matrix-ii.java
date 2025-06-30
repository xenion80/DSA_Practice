class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
       
        int top=0;
        int left=0;
        int bottom=mat.length-1;
        int right=mat[0].length-1;
        int value=1;
        
        while(top<=bottom && left<=right){
            
            //left to right
            for(int i=left;i<=right;i++){
                mat[top][i]=value++;

            }
            top++;
            //right to down
            for(int j=top;j<=bottom;j++){
                mat[j][right]=value++;
            }
            right--;
            if(top<=bottom){
                //left downn to right down
                for(int j=right;j>=left;j--){
                    mat[bottom][j]=value++;
                }
                bottom--;

            }
            if(left<=right){
                //left down to left up
                for(int i=bottom;i>=top;i--){
                    mat[i][left]=value++;


                }
                left++;
            }
        }
        return mat;
    }
}