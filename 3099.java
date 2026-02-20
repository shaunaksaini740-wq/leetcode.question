class Solution 
{
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int n=x,s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        if(x%s==0)
        return s;
        return -1;
    }
}
