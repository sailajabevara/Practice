class Solution {
    public String convert(String s) {
        StringBuilder out = new StringBuilder();
        String[] words = s.split(" ");

        for (String w : words) {
            if (w.length() > 0) {
                out.append(Character.toUpperCase(w.charAt(0)))
                   .append(w.substring(1))
                   .append(" ");
            }
        }
        return out.toString().trim();
    }
}