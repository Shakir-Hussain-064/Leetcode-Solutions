class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrows = matrix.length;
        int totalcol = matrix[0].length;

        int n = totalrows * totalcol;

        //1D array
        int s = 0;
        int e = n-1;

        //Binary Search
        while(s <= e){
            int mid = s + (e-s)/2;
            int rowIndex = mid / totalcol;
            int colIndex = mid % totalcol;

            if(matrix[rowIndex][colIndex] == target){
                return true;
            }
            else if(matrix[rowIndex][colIndex] > target){
                //left
                e = mid-1;
            }
            else{
                //right
                s = mid+1;
            }
        }
        return false;
    }
}