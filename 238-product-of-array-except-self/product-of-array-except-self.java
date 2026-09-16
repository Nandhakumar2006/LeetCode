class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] answer = new int[nums.length];

        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);

        for(int i=0;i<prefix.length;i++){
            if(i==0) continue;
            else if(i==1) prefix[i]=nums[0];
            else{
                prefix[i]=nums[i-1]*prefix[i-1];
                
            }
            
        }

        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1) continue;
            else if(i==nums.length-2) suffix[i]=nums[nums.length-1];
            else{
                suffix[i]=nums[i+1]*suffix[i+1];
            }
        }

        for(int i=0;i<nums.length;i++){
            answer[i]=prefix[i]*suffix[i];
        }

        return answer;

    }
}