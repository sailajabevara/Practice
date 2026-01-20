class Solution {
    public boolean areIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> st = new HashMap<>();
        Map<Character, Character> ts = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            
            if(st.containsKey(ss) && st.get(ss) != tt) return false;
            if(ts.containsKey(tt) && ts.get(tt) != ss) return false;
            
            st.put(ss, tt);
            ts.put(tt, ss);
        }
        
        return true;
    }
}