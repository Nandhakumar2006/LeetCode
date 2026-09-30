class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            char t=Character.toLowerCase(c);
            if(Character.isLetterOrDigit(c)) sb.append(t);
        }

        int left=0,right=sb.length()-1;

        while(left<right){
            if(sb.charAt(left)!=sb.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }
}