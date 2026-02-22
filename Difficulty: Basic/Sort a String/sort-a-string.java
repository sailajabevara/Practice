class Solution {
    String sort(String s) {
        // code here
        String sb = new String("");
        for(char ch ='a'; ch<='z'; ch++){
            for(int i = 0 ; i<s.length(); i++){
                if(s.charAt(i)==ch){
                    sb+=ch;
                }
            }
        }
        
        return sb.toString();
    }
}

