class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();

        for(String s : strs){
            int[] fre = new int[26];
            for(char x:s.toCharArray()){
                fre[x-'a']++;
            }
            String s1 = "";
            StringBuilder sb = new StringBuilder(s1);
            for(int x:fre){
                sb.append((char)x);
            }
            String s2 = sb.toString();
            if(!map.containsKey(s2)){
                map.put(s2,new ArrayList());
            }
            map.get(s2).add(s);
        }   

        return new ArrayList(map.values());
    
    }
}