class Solution {
    public int rearrangeCharacters(String s, String target) {

        if(s.length()<target.length()) return 0;

        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> targetMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);
        }
        for(char ch : target.toCharArray()){
            targetMap.put(ch,targetMap.getOrDefault(ch,0)+1);
        }

        int[] ans = new int[target.length()];

        for(int i=0;i<target.length();i++){
            if(sMap.containsKey(target.charAt(i))) ans[i]=sMap.get(target.charAt(i))/targetMap.get(target.charAt(i));

            else ans[i]=0;
        }

        Arrays.sort(ans);

        return ans[0];

    }
}