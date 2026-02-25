class Solution {
    // Function to find the minimum indexed character.
    public static int minIndexChar(String s1, String s2) {
        // Your code here
        Set<Character> set = new HashSet<>();

        // Add all characters of s2 into the set
        for (char ch : s2.toCharArray()) {
            set.add(ch);
        }

        // Traverse s1 and return the first index where char exists in s2
        for (int i = 0; i < s1.length(); i++) {
            if (set.contains(s1.charAt(i))) {
                return i;
            }
        }

        return -1;
    }
} 