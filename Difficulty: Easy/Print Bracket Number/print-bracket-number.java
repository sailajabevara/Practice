// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
                st.push(count);
                list.add(count);
            }else if(str.charAt(i)==')'){
                list.add(st.pop());
            }
            
            
        }
        return list;
    }
};