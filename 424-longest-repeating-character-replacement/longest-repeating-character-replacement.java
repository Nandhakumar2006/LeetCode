class Solution {
    public int characterReplacement(String s, int k) {
        int[] fre = new int[26];
        int left = 0,right =0;
        int maxfre = 0,maxlength = 0;

        for(right=0;right<s.length();right++){
            fre[s.charAt(right)-'A']++;
            maxfre=Math.max(maxfre,fre[s.charAt(right)-'A']);
            if((right-left+1)-maxfre>k){
                fre[s.charAt(left)-'A']--;
                left++;
            }

            maxlength=Math.max(maxlength,right-left+1);
        }

        return maxlength;
    }
}