class Solution {
    public int maximumBags(int[] cap, int[] rock, int extra) {
        int n = cap.length;
    
        int[] sub = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            sub[i] = cap[i] - rock[i];
        }
        
     
        Arrays.sort(sub);

          for(int i = 0; i < n; i++){
             if(sub[i] <= extra){
                 count++;
                 extra -= sub[i];
             }
          }
        return count;
        
    }

}
