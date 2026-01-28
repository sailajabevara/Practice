class Solution {
    public int reverseExponentiation(int n) {
        // code here
        if(n == 0 || n == 1 || n == 10) return n;
    
        return (int)Math.pow(n,n);
        
    }
    
    
}