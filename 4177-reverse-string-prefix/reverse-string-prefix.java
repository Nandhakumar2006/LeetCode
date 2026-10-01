class Solution {
    public String reversePrefix(String s, int k) {
        char[] prefix = new char[k];

        int idx=0;
        for(char ch : s.toCharArray()){
            prefix[idx] = ch;
            idx++;   
            if(idx >= k ) break;
        }
        StringBuilder reversedPrefix = new StringBuilder();
        for(char ch : prefix){
            reversedPrefix.append(ch);
        }
        reversedPrefix.reverse();
        

        StringBuilder remainingString = new StringBuilder(s.substring(k,s.length()));

        reversedPrefix.append(remainingString);
        String ans = reversedPrefix.toString();

        return ans;
    }
}