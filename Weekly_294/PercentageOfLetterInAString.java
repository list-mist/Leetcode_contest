class Solution {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int count = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == letter) count++;
        }
        int per = (count*100)/len;
        
        return per;
    }
}