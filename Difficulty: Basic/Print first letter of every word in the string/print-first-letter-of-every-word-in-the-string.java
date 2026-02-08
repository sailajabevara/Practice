class Solution {
    String firstAlphabet(String S) {
        // code here
           StringBuilder sb=new StringBuilder();
        String[] A=S.split(" ");
        for(String j : A)
        {
            if(A.length>0)
            {
                sb=sb.append(j.charAt(0));
            }
        }
        return sb.toString();
    }
}