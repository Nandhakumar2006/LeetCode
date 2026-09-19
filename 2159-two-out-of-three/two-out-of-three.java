class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();

        for(int num1:nums1) s1.add(num1);
        for(int num2:nums2) s2.add(num2);
        for(int num3:nums3) s3.add(num3);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num1:s1) map.put(num1,0);
        for(int num2:s2) map.put(num2,0);
        for(int num3:s3) map.put(num3,0);

        for(Integer s:s1){
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
        }
        for(Integer s:s2){
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
        }
        for(Integer s:s3){
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
        }

        List<Integer> l = new ArrayList<>();
        for(Integer m : map.keySet()){
            if(map.get(m)>=2) l.add(m);
        }

        return l;
        
    }
}