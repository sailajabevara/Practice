class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> sta=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='('){
                sta.push(')');
            }
            else if(ch[i]=='{'){
                sta.push('}');
            }
            else if(ch[i]=='['){
                 sta.push(']');
            }
            else if(sta.isEmpty() || ch[i]!=sta.pop()){
                return false;
            }
        }
        return sta.isEmpty();
    }
}
