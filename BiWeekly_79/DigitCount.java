class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < num.length();i++){
            int a = Integer.parseInt(num.substring(i,i+1));
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i = 0; i < num.length();i++){
            int a = Integer.parseInt(num.substring(i,i+1));
            if(map.containsKey(i)){
                
                int val = map.get(i);
                if(a != val) {
                    return false;
                }
            }
            else{
                if(a != 0) return false;
            }
        }
        return true;
    }
}
