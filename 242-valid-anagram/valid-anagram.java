class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);

        for(int i=0;i<sb.length();i++){
            for(int j=0;j<tb.length();j++){
                if(sb.charAt(i)==tb.charAt(j)){
                    sb.deleteCharAt(i);
                    tb.deleteCharAt(j);  
                    i--;
                    j--;
                    break;
                }
            }
        }

         return sb.length()==0 && tb.length()==0;
    }
}