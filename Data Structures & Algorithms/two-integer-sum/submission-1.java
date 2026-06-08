class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int x = target - nums[i];
            if(hm.containsKey(x)){
                return new int[]{hm.get(x),i};
            }else{
                hm.put(nums[i],i);
            }
        }   
        throw new IllegalArgumentException("No two sum solution");
    }
}
