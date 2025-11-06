class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr); int n=arr.length;
        int l=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            if(arr[i-1]<arr[i])
            {
                return arr[i-1];
            }
            
        }
        return -1;
    }
    
}