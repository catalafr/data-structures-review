class ClimbingStairs {
    public int climbStairs(int n) {
        return fibonaciDP(n);
    }
    
//     public int fibonaciRecursive(int n) {
//         if(n == 1) return 1;
//         if(n == 2) return 2;
//         return climbStairs(n - 1) + climbStairs(n - 2);
//     }
    
//     public int fibonaciIterative(int n) {
//         if(n == 1) return 1;
//         if(n == 2) return 2;
        
//         int[] fibo = new int[n];
    
//         fibo[0] = 1;
//         fibo[1] = 2;
        
//         for(int i = 2; i < fibo.length; i++) {
//             fibo[i] = fibo[i-1] + fibo[i-2];
//         }
//         return fibo[n-1];
//     }
    
    public int fibonaciDP(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int fib1 = 1;
        int fib2 = 2;
        int fib3 = 0;
        
        for(int i = 2; i < n; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        
        return fib3;
    }
}
