class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left = 0 , right = nums.length-1;
        int[] ans = new int[nums.length];

        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]>0){
                ans[left]=nums[i];
                left+=2;
            }
            if(nums[j]<0){
                ans[right]=nums[j];
                right-=2;
            }
        }

        return ans;
    }
}