class Solution {
    public int[] twoSum(int[] nums, int target) {
         /* hash map stores key/value, use put() method map.put("key","value") / use get() method map.get("key"); returns value use containsKeymethod */
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i <nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            return new int[] {map.get(complement),i};
        map.put(nums[i],i);
        }
        return null;
    }
}