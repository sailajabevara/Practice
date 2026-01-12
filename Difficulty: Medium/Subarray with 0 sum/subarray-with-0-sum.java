class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        Set<Integer> st = new HashSet<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+= arr[i];
            
            if(sum == 0 ||  st.contains(sum))
            {
                return true;
            }
            st.add(sum);
        }
        return false;
    }
}