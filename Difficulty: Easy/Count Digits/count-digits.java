class Solution {
    static int evenlyDivides(int n) {
        int N =n;
        int c=0;
        while(n!=0){
            
            int d=n%10;
            n=n/10;
            
            if(d!=0 && N%d==0){
                c++;
            }
        }
        return c;
    }
}



