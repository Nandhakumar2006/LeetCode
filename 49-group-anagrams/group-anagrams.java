class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] fre = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                fre[strs[i].charAt(j) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int x : fre) {
                sb.append(String.valueOf(x)).append("#");
            }
            String s = sb.toString();

            
            if(!map.containsKey(s)) {
                map.put(s, new ArrayList());
            }
            map.get(s).add(strs[i]);

        }

        return new ArrayList(map.values());
    }
}