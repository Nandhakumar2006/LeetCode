class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length==0) return 0;

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int max = 1;

        for(int num:set){
            if(set.contains(num-1)) continue;
            else{
                int currentnum=num;
                int currentsub=1;
                while(set.contains(currentnum+1)){
                    currentnum++;
                    currentsub++;
                }
                max=Math.max(max,currentsub);
            }
        }

        return max;
    }
}