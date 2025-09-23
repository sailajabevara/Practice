// User function Template for Java
class Solution {
    public int reducingWalls(int[] arr, int k) {
      int count = 0;
      for(int height:arr){
          if(height > k){
             count += (height - 1) / k;
          }
      }
      return count;
        
    }
}

