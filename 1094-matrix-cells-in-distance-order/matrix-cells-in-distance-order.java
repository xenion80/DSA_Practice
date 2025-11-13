class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        int[][] ans = new int[rows * cols][2];
        int k = 0;
        
        // Collect all cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[k][0] = i;
                ans[k][1] = j;
                k++;
            }
        }

        // Sort based on Manhattan distance
        Arrays.sort(ans, (x, y) -> 
            (Math.abs(x[0] - rCenter) + Math.abs(x[1] - cCenter)) - 
            (Math.abs(y[0] - rCenter) + Math.abs(y[1] - cCenter))
        );
        
        return ans;
    }
}