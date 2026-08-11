class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            //[2,7,11,15]  , nums[0] = 2
            //target = 9
            //remaining = 9 - 2 = 7
            int remaining = target - nums[i];
            //Check if we've already seen that number
            if (map.containsKey(remaining)) {
                return new int[] {map.get(remaining), i};
            }
            //store the current num in the map
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}