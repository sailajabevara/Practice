class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> nge = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            if(!st.isEmpty() && st.peek()>arr[i])
                nge.add(st.peek());
            else
                nge.add(-1);
            st.push(arr[i]);
        }
        Collections.reverse(nge);
        return nge;
    }
}

