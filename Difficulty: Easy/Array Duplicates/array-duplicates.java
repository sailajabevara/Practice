import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int ele = Math.abs(arr[i]);

            if (arr[ele - 1] < 0) {
                result.add(ele);
            } else {
                arr[ele - 1] = -arr[ele - 1];
            }
        }

        return result;
    }
}
