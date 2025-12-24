class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        d = d % arr.length;
        int []num = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            num[i] = arr[(i + d) % arr.length];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num[i];
        }
    }
}