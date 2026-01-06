class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result=new ArrayList<>();
        int first=0,second=1;
        while(second!=arr.length){
            if(arr[first]==arr[second]){
                second++;
                continue;
            }
            result.add(arr[first]);
            first=second;
            second+=1;
            }
        if(arr[first]==arr[second-1])
        result.add(arr[first]);
        return result;
    }
}