class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ColLeft = 0, ColRight = matrix.length-1;

        while (ColLeft <= ColRight) {
            int ColMid = (ColLeft + ColRight) / 2;
            
            if(matrix[ColMid][0] > target ){
                ColRight = ColMid - 1;
            }
            else if(matrix[ColMid][matrix[0].length-1]  < target){
                ColLeft = ColMid + 1;
            }
            else{
                int RowLeft = 0, RowRight = matrix[0].length-1;

                while (RowLeft <= RowRight) {
                int RowMid = (RowLeft + RowRight) / 2;
                if (matrix[ColMid][RowMid] == target)
                    return true;
                else if (matrix[ColMid][RowMid] < target)
                    RowLeft = RowMid + 1;
                else
                    RowRight = RowMid - 1;
            }

            return false;
            }
            
        }

        return false;

        
    }
}