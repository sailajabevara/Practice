class Solution {
    public static boolean checkPangram(String s) {
        // code here
        int[] hash = new int[256];
        if(s.length()<26) return false;
        
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i) - 'a';
            int b = s.charAt(i) - 'A';
            if(a>=0){
                hash[a+97]+=1;
            }
            else{
                hash[b +65]+=1;
            }
        }
        for(int i=65;i<=90;i++){
            if(hash[i]==0 && hash[i+32]==0){
                return false;
            }
        }
        return true;
    }
}