class Solution {
    public int majorityElement(int[] nums) {
        int Major = (nums.length)/2;
        HashMap<Integer,Integer> Frequency = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            Frequency.put( nums[i] , Frequency.getOrDefault(nums[i],0)+1 );
        }

        for(Integer fre : Frequency.keySet()){
            if(Frequency.get(fre) > Major ) return fre;
        }         

         return -1 ;   
    }
}