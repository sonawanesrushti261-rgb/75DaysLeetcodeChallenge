class Solution {
    public int fiboFormula(int n){
        //just for demo, use long instead
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2) , n) / Math.sqrt(5));
    }
    public int fib(int n) {
       //base condition
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}