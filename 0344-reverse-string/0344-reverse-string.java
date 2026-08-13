class Solution {
    public void reverseStringHelper(char[] s, int start, int end){
        //base condition
        if(start >= end){
            return;
        }

        //swap
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverseStringHelper(s, start + 1, end - 1);
    }
    public void reverseString(char[] s) {
        // this was a normal way just like how we reverse an array similar
        // int start = 0;
        // int end = s.length-1;
        // while(start < end){
        //     //swap
        //     char temp = s[start];
        //     s[start] = s[end];
        //     s[end] = temp;

        //     start++;
        //     end--;
        // }


        //call that recursive fun
        reverseStringHelper(s, 0, s.length-1);
    }
}