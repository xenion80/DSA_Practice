class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        if(matrix==null||matrix.length==0){
            return result;
        }
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);

            }
            top++;
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}