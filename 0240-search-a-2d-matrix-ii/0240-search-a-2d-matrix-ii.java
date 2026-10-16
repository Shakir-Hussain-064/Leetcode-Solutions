class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrow = matrix.length;
        int totalcol = matrix[0].length;

        int row = 0;
        int col = totalcol-1;

        while(row < totalrow && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}