class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
    
            for(int j=i;j<nums.length;j++){
                if(rem==nums[j] && i!=j){
                    return new int[]{i,j};
                }
            }
            
 
        }
        return new int[]{};
    }
    
}