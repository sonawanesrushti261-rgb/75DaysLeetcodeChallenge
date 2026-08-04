class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i <arr.length){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<arr.length; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }     //does index 5 contain 5+1=6 no so 6 is missing
        }
        return ans;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}