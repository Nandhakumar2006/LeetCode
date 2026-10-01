class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         int even = 0 , odd = 1;
         int[] ans = new int[nums.length];

         for(int num : nums){
            if(num%2==0){
                ans[even]=num;
                even+=2;
            }
            if(num%2!=0){
                ans[odd]=num;
                odd+=2;
            }
         }

         return ans;
    }
}