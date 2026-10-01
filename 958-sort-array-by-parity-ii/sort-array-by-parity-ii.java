class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         int even = 0 , odd = nums.length-1;
         int[] ans = new int[nums.length];

         for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]%2==0){
                ans[even]=nums[i];
                even+=2;
            }
            if(nums[j]%2!=0){
                ans[odd]=nums[j];
                odd-=2;
            }
         }

         return ans;
    }
}