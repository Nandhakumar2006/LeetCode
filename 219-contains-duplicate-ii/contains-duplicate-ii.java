class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numsMap.containsKey(nums[i]) && Math.abs(i-numsMap.get(nums[i]))<=k) return true;
            numsMap.put(nums[i],i);
        }

        return false;
    }
}