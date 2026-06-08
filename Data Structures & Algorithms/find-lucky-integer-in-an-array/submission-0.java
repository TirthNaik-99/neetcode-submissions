class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int freq:arr){
            hm.put(freq, hm.getOrDefault(freq,0)+1);
        }

        int result = -1;
        for(int nums:hm.keySet()){
            if(nums == hm.get(nums)){
                result = Math.max(result, nums);
            }
        }
        return result;
    }
}