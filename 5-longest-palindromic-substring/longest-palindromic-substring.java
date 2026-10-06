class Solution {
    public String longestPalindrome(String s) {
        String oddString = "";
        String evenString = "";
        String oddMaxsub = "";
        String evenMaxsub = "";
        int oddMax = 0 ;
        int evenMax = 0 ;

        for(int i = 0 ; i < s.length() ; i++ ){
            oddString=maxPalindrome(s, i, i);
            evenString=maxPalindrome(s, i, i+1);

            if(oddString.length()>oddMax){
                oddMaxsub  = oddString;
                oddMax = oddString.length();
            }

            if(evenString.length()>evenMax){
                evenMaxsub  = evenString;
                evenMax = evenString.length();
            }
        }

        // System.out.println(oddMaxsub);
        // System.out.println(evenMaxsub);

        if(oddMaxsub.length()>evenMaxsub.length()){
            return oddMaxsub;
        }
        else{
            return evenMaxsub;
        }       
    }

    String maxPalindrome(String s, int left , int right){
        
        int max = 0 ;
        String maxSub = "";

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            String sub = s.substring(left,right+1);
            if(sub.length()>max){
                maxSub = sub ;
                max = sub.length();
            }
            left--;
            right++;
        }
        return maxSub;
    }
}