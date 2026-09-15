class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int reminder = target-nums[i];

            if(hm.containsKey(reminder)){
                return new int[]{i,hm.get(reminder)};
            }

            else hm.put(nums[i],i);
        }

        return new int[]{};
    }
}