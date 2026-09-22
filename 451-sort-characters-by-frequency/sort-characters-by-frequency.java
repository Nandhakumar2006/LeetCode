class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        for(Character ch : map.keySet()){
            pq.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        int i=0;

        while(!pq.isEmpty()){
            i=0;
            while(i<map.get(pq.peek())){
                sb.append(pq.peek());
                i++;
            }
            pq.poll();
            
        }
        String s1 = sb.toString();

        return s1;
        
    }
}