import java.util.*;

public class Solution {
    public static int missingNum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 1;
        }

        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = missingNum(arr);
        System.out.println("Missing number is: " + result);

        sc.close();
    }
}
