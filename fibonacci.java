class Solution 
{
    public int fib(int n) 
    {
        if(n <= 1)
        {
            return n;
        }

        int first = 0;
        int second = 1;

        for(int iCnt = 2; iCnt <= n; iCnt++)
        {
            int third = first + second;

            System.out.println(third);

            first = second;
            second = third;
        }

        return second;
    }
}

class fibonacci
{
    public static void main(String[] args) 
    {
        Solution obj = new Solution();

        int n = 5;

        int result = obj.fib(n);

        System.out.println("Fibonacci of " + n + " is : " + result);
    }
}