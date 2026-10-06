class Solution {
    public String longestPalindrome(String s) {
        int right = 0 , left = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            int odd = palindrome(s, i , i);
            int even = palindrome(s, i ,i+1);

            int maxLen = Math.max(odd,even);
            if( maxLen>right-left){
                left = i - (maxLen-1)/2;
                right = i + maxLen/2;
            }
        }

        return s.substring(left,right+1);
    }

    int palindrome(String s, int left, int right){
        
        while(left>=0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return right-left-1;
    }
}