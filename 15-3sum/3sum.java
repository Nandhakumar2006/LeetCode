class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ll = new ArrayList<>();
        HashSet<List> set = new HashSet<>(); 

        for(int i=0;i<nums.length-2;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> l = Arrays.asList(nums[i],nums[left],nums[right]);
                    if(!set.contains(l)){
                        ll.add(l);
                        set.add(l);
                    }
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ll;
    }
}