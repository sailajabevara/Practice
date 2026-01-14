class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        char arr[]=s.toCharArray();
        TreeMap<Character,Integer>tm=new TreeMap<>();
        for(char i:arr){
            tm.put(i,tm.getOrDefault(i,0)+1);
        }
        int max=0;
        Set<Character> s1=tm.keySet();
        for(char j:s1){
            max=Math.max(max,tm.get(j));
        }
        for(char x:s1){
            if(tm.get(x)==max)
                return x;
        }
        return 0;  
    }
}