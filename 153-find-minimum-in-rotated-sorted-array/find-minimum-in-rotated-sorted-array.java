class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE ; 
        int left = 0 , right = nums.length - 1 ;

        while(left<=right){
            int mid = left + (right - left) / 2 ;

            ans = Math.min( ans , nums[mid] ) ;
            if( nums[mid] > nums[right] ) left = mid + 1  ;
            else right = mid - 1;
        }

        return ans ; 
    }
}