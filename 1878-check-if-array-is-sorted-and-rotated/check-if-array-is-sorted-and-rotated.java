class Solution {
    public boolean check(int[] nums) {
        int[] ans = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            int j = 0;
            while(j<nums.length -1 ) {
                int temp = nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                j++;
            }

            if(Arrays.equals(ans,nums)) return true;
        }

        return false;
    }
}