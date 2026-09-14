import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        String s = "";
        for(int i=0;i<nums.length;i++){
            s=s+Integer.toString(nums[i]);
        }
        String[] sa = s.split("0");
        int max=0;
        for(int i=0;i<sa.length;i++){
            if(sa[i].length()>max) max=sa[i].length();
        }
        return max;
            
}
}