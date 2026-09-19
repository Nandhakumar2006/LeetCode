class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> orderMap = new HashMap<>();

        int idx=0;
        for(char o : order.toCharArray()){
            orderMap.put(o,idx);
            idx++;
        }

        for(int i=0;i<words.length-1;i++)
        {
            for(int j=0;j<words[i].length();j++){
                if(j>=words[i+1].length()) return false;
                if(words[i].charAt(j)!=words[i+1].charAt(j)){
                    if(orderMap.get(words[i+1].charAt(j))<orderMap.get(words[i].charAt(j))){
                        return false;
                    }
                    else{
                        break;
                    }
                }
            }
        }

        return true;
    }
}