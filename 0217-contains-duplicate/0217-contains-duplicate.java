class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);        
        //1 2 3 1 here after sortingit becomes 
        //1 1 2 3
        //      i there is no i+1 in this case when i=3 so remember to take for loop from 0 to arr length - 1
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}