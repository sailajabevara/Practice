class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int temp=0;
       for(int i=0;i<n/2;i++){
           temp = arr[i];
           arr[i] = arr[n-1-i];
           arr[n-1-i] = temp;
       }
    }
}