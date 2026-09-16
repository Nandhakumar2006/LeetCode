class Solution {
    public int pivotIndex(int[] nums) {
        int[] ans = new int[nums.length];
        int left=0,right=0;

        for(int i=0;i<nums.length;i++){
            ans[i]=left;
            left+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]-=right;
            right+=nums[i];
        }

        for(int i=0;i<ans.length;i++){
            if(ans[i]==0) return i;
        }
        return -1;
    }
}