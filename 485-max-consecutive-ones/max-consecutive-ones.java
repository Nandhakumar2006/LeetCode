import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=1;
        int[] max = new int[nums.length];
        if(nums.length==1 && nums[0]==1) return 1;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count1++;
        }
        if(count1!=0){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==1 && nums[i+1]==1){
                count++;
                max[i]=count;
            }
            else{
                max[i]=count;
                count=1;
            }
        }
        }
        else
        {
            return 0;
        }
        int maxie=0;
        for(int i=0;i<max.length;i++){
            if(max[i]>maxie){
                maxie=max[i];
            }
        }
        return maxie;
    }
}
