class Solution {
    public int findKthLargest(int[] nums, int k) {
        //by sorting 
        // int n = nums.length;
        // Arrays.sort(nums);
        // return nums[n - k];

        //by using min heap 
        //comeback to this Q after studying heap
        PriorityQueue<Integer> heap = new  PriorityQueue<>();

        for(int num : nums){
            if(heap.size() < k){
                heap.add(num);
            }else{
                if(num > heap.peek()){
                    heap.poll();
                    heap.add(num);
                }
            }
        }
        return heap.peek();
    }
}