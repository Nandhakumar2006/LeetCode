class Solution {

    boolean matches(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }

        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1fre = new int[26];
        int[] s2fre = new int[26];

        for(char s1char:s1.toCharArray()){
            s1fre[s1char-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            s2fre[s2.charAt(i)-'a']++;

            if(i>=s1.length()){
                s2fre[s2.charAt(i-s1.length())-'a']--;
            }

            if(i>=s1.length()-1 && matches(s1fre,s2fre) ) return true;
            
        }

        return false;
    }
}