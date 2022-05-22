class Solution {
    public int minimumLines(int[][] stock) {
        Arrays.sort(stock,(a, b) -> Integer.compare(a[0], b[0]));
        int n = stock.length, count = 1;
        if(n == 1) return 0;
        for(int i = 0; i < n-2; i++){
            int x1 = stock[i][0], y1 = stock[i][1], x2 = stock[i+1][0], y2 = stock[i+1][1], x3 = stock[i+2][0], y3 = stock[i+2][1];
            
            int diff1 = (y2-y1) * (x3-x2);
            int diff2 = (y3 - y2) * (x2 - x1);
            
            if(diff1 != diff2) count++;
        }
        return count;
    }
   
}
