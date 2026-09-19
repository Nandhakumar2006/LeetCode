class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> strMap = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            int[] fre = new int[26];
            for(int j=0;j<strs[i].length();j++){
                fre[strs[i].charAt(j)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int x:fre){
                sb.append((char)(x));
            }
            String s = sb.toString();
            if(!strMap.containsKey(s)) strMap.put(s,new ArrayList());
            strMap.get(s).add(strs[i]);
        }

        return new ArrayList(strMap.values());
    }
}