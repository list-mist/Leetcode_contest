class Solution {
    public String largestWordCount(String[] msg, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < senders.length; i++){
            if(map.containsKey(senders[i])){
                int a = map.get(senders[i]) + getCountOfWords(msg[i]);
                map.put(senders[i],a);
            }else{
                int a = getCountOfWords(msg[i]);
                 map.put(senders[i],a);
            }
        }
        int max = 0;
        String res = "";
     
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(max < e.getValue()){
                max = e.getValue();
                res = e.getKey();
            }
            else if(max == e.getValue()){
                if(res.compareTo(e.getKey()) < 0){
                      res = e.getKey();
                  }
            }
        }
        return res;
    }
    int getCountOfWords(String words){
        String[] word = words.split(" ");
        return word.length;
    }
}
