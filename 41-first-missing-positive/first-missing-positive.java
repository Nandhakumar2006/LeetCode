class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for(int num : nums) numSet.add(num);

        for(int i=1;i<Math.pow(2,31)-1;i++){
            if(!numSet.contains(i)) return i;
        }

        return -1;
    }
}