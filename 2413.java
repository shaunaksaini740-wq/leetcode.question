class Solution 
{
    public int smallestEvenMultiple(int n) 
    {
        int g=n;
        while (true) 
        { 
            if (g%2==0 && g%n==0) 
            {
                return g; 
            }
            g++; 
        }
    }
}
