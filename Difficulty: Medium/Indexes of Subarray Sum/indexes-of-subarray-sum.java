class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int sum = 0;
        int i = 0, j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (j < n) {
            sum += arr[j];

            while (sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == target) {
                ans.add(i + 1);  
                ans.add(j + 1);
                return ans;
            }

            j++;
        }

        ans.add(-1);
        return ans;
    }
}
