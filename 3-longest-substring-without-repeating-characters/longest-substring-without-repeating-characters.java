class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sSet = new HashSet<>();
        int left=0,right=0,maxLength=0;

        for(right = 0;right<s.length();right++){
            if(sSet.contains(s.charAt(right))){
                while(sSet.contains(s.charAt(right))){
                    sSet.remove(s.charAt(left));
                    left++;
                }

                sSet.add(s.charAt(right));


            }
            else{
                sSet.add(s.charAt(right));
            }
            maxLength=Math.max(maxLength,right-left+1);
        }

        return maxLength;
    }
}