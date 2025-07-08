class Solution {
    public int countNegatives(int[][] grid) {
       int no=no(grid);
        return no;
    }
    static int no(int[][] grid){
        int s=0;
        int e= grid[0].length-1;
        int count=0;
        while(s<grid.length&&e>=0){
            if(grid[s][e]>=0){
                s++;
            }
            else{
                count+= grid.length-s;
                e--;
            }
        }
        return count;
    }
}