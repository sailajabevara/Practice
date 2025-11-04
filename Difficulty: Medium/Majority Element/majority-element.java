
class Solution {
    int majorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1, count = 0;

        // Phase 1: Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate)
                count++;
        }

        if (count > n / 2)
            return candidate;
        else
            return -1;
    }
}
