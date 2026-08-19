class Solution {
    public int maxSubArray(int[] nums) {
        //to find the maximun sum possible
        int max_so_far = nums[0];
        //to store the maximun found at the position
        int curr_max = nums[0];

        for(int i = 1; i < nums.length; i++){
            //equivalent to step 3
            curr_max = Math.max(nums[i], nums[i] + curr_max);
            //equivalent to step 4
            max_so_far = Math.max(curr_max , max_so_far);
        }
        return max_so_far;
    }
}