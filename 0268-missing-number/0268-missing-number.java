class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while(i <arr.length){
            int correctIdx = arr[i];
           if(arr[i]< arr.length && arr[i] != arr[correctIdx]){
                swap(arr, i, correctIdx);
            }else{
                i++;
            }
        }

        //search for missing num
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        //case 2
        return arr.length;    //return n
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}