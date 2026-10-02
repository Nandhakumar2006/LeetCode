class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] ans = new int[5];
        HashMap<Character,Integer> textMap = new HashMap<>();

        for(char ch : text.toCharArray()){
            textMap.put(ch,textMap.getOrDefault(ch,0)+1);
        }
            ans[0]=textMap.getOrDefault('b',0);
            ans[1]=textMap.getOrDefault('a',0);
            ans[2]=textMap.getOrDefault('l',0)/2;
            ans[3]=textMap.getOrDefault('o',0)/2;
            ans[4]=textMap.getOrDefault('n',0);
        

       Arrays.sort(ans);
       return ans[0]; 
    }
}