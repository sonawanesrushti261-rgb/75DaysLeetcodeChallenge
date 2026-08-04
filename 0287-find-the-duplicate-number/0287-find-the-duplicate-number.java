class Solution {
    public int findDuplicate(int[] arr) {
         int i = 0;
        while(i < arr.length){

            if(arr[i] != i + 1){
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else{
                return arr[i];
            }
            }else{
                i++;
            }
        }
        return -1;     //if no duplicate
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}