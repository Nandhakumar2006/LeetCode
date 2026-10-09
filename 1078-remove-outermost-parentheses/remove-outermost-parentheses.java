class Solution {
    public String removeOuterParentheses(String s) {
        int countLeft = 0 ;
        int countRight = 0 ;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++ ){
            if(s.charAt(i)=='(') countLeft++ ; 

            else if ( s.charAt(i)==')') countRight++ ;


            if(countLeft == countRight && i > 0 ){
                int start = i-(countLeft+countRight-1);
                int end = i ;
                countLeft=0;
                countRight=0;
                sb.append(s.substring(start+1,end));
            }

            
        }
        String ans = sb.toString();
        return  ans ;
    }
}