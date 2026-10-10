class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int major = nums.length/3 ;
        for(int num : nums ) frequency.put(num,frequency.getOrDefault(num,0)+1);

        for(Integer fre : frequency.keySet() ){
            if(frequency.get(fre) > major ) ans.add(fre);
        }

        return ans;
    }
}