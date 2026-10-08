class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       
        int first = firstPosition(nums,target);
        int last = lastPosition(nums,target);

        return new int[]{first,last};
    }

    int firstPosition(int[] nums , int target ){
        int left = 0 ;
        int right = nums.length -1 ;
        int answer = -1 ;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                answer = mid ;
                right = mid - 1 ;
            }
            else if ( nums[mid] < target ){
                left = mid + 1 ;
            }
            else{
                right = mid - 1 ;
            }
        }
        return answer;
    }

    int lastPosition(int[] nums , int target ){
        int left = 0 ;
        int right = nums.length -1 ;
        int answer = -1 ;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                answer = mid ;
                left = mid + 1 ;
            }
            else if ( nums[mid] < target ){
                left = mid + 1 ;
            }
            else{
                right = mid - 1 ;
            }
        }
        return answer;
    }
}