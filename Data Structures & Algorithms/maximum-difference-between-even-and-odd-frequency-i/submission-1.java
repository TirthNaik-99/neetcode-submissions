class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        int evenFreq = Integer.MAX_VALUE;
        int oddFreq = Integer.MIN_VALUE;

        for(int frequency:hm.values()){
            if(frequency % 2 == 0){
                evenFreq = Math.min(evenFreq,frequency);
            }else{
                oddFreq = Math.max(oddFreq, frequency);
            }
        }
        return oddFreq - evenFreq;
    }
}