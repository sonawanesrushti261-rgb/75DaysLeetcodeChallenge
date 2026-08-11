class Solution {
    public int majorityElement(int[] nums) {
        //[2,2,1,1,1,2,2] in this example n = 7, and we want ele that appears more than n/2 times 7/2=3 
        //1 comes 3 times but 2 comes 4 times, so ans = 2


        //one way is simple
        //if we sort the array first the mid ele will obv be the majority ele
        Arrays.sort(nums);
        return nums[nums.length/2];
        //here space complexity is O(1) but time complexity is O(N logN)


        }
}