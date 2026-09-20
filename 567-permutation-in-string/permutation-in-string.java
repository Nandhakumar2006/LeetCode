class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> s1map = new HashMap<>();
        HashMap<Character,Integer> s2map = new HashMap<>();

        for(char s:s1.toCharArray()){
            if(s1map.containsKey(s)) s1map.put(s,s1map.get(s)+1);
            else s1map.put(s,1);
        }

        for(int i=0;i<s2.length();i++){
            if(s2map.containsKey(s2.charAt(i))){
                s2map.put(s2.charAt(i),s2map.get(s2.charAt(i))+1);
                // System.out.println(s2.charAt(i));
            }
            else{
                s2map.put(s2.charAt(i),1);
            }
            if(i>=s1.length()){
                if(s2map.get(s2.charAt(i-s1.length()))>1){
                    s2map.put(s2.charAt(i-s1.length()),s2map.get(s2.charAt(i-s1.length()))-1);
                }
                else{
                s2map.remove(s2.charAt(i-s1.length()));
                }
            }

            // System.out.println("s1map : "+s1map);
            // System.out.println("s2map : "+s2map);
            if(s1map.equals(s2map) && i>=s1.length()-1) return true;

        }

        return false;

        
    }
}
