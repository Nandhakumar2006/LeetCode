class Solution {
    public String reversePrefix(String word, char ch) {
        char[] wordChar = word.toCharArray();

        int idx = word.indexOf(ch);

        int left = 0 , right = idx;

        while(left<right){
            char temp = wordChar[left];
            wordChar[left] = wordChar[right];
            wordChar[right] = temp;
            left++;
            right--;

        }

        return new String(wordChar);
    }
}