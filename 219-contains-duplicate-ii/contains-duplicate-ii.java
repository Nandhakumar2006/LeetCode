class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> numsSet = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(numsSet.containsKey(nums[i])){
                if(Math.abs(numsSet.get(nums[i])-i)<=k){
                    return true;
                }
            }
            numsSet.put(nums[i],i);
        }
        return false;
    }
}