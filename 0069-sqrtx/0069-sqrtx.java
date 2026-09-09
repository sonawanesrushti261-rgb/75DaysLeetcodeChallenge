class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        int result = 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            //x -> INT_MAX possible
            //mid = x / 2 -> x/2 * x/2
            long sqrd = (long) mid * mid;

            if(sqrd == x){
                return mid;
            } else if(sqrd < x){
                result = mid;
                start = mid + 1;
            }else{
                //sqrd > mid
                end = mid - 1;
            }
        }
        return result;
    }
}