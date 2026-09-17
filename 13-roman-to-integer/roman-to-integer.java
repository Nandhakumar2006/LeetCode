class Solution {
    HashMap<String, Integer> values = new HashMap<>();

    Solution() {
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);
    }

    public int romanToInt(String s) {

        int integer = 0,i=0;

        while(i<s.length()){
            if(i<s.length()-1 && values.containsKey(s.substring(i,i+2))){
                integer+=values.get(s.substring(i,i+2));
                i+=2;
                continue;
            }

            integer+=values.get(String.valueOf(s.charAt(i)));
            i++;

        }

       return integer;
    }
}