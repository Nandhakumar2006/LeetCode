class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;

        for(String s : strs) min=Math.min(min,s.length());

        StringBuilder sb = new StringBuilder();

        

        for(int i=0 ; i<min ; i++){
            int count=1;
            for(int j=1 ; j<strs.length ;j++){
                if(strs[j].charAt(i)!=strs[j-1].charAt(i)){
                    count=0;
                    break;
                }
            }
            if(count==1) sb.append(strs[0].charAt(i));
            if(count==0) break;
        }

        String s = sb.toString();

        return s;
    }
}