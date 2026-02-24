class Solution
{
    int transform (String A, String B)
    {
    if(A.length()!=B.length())return -1;
    
    HashMap<Character, Integer>  hm= new HashMap<>();
    
    for(int i=0;i<A.length();i++){
        hm.put(A.charAt(i),hm.getOrDefault(A.charAt(i),0)+1);
        hm.put(B.charAt(i),hm.getOrDefault(B.charAt(i),0)-1);   }
        
        for(int c:hm.values()){
            if(c!=0)return -1;
        }
        
        int i=A.length()-1;
        int j=B.length()-1;
        
        int ans=0;
        while(i>=0 && j>=0){
            if(A.charAt(i)==B.charAt(j)){
                i--;j--;
            }
            else{
                ans+=1;
                i-=1;
            }
            
        }
        return ans;
        
    }
}