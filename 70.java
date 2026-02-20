class Solution {
    public int climbStairs(int n) {
    int a=1,b=1,c=0,i=2;
    if(n==0||n==1)
    return 1;    
    while(n>=i)
    {
     c=a+b;
     a=b;
     b=c;
     i++;
    }
    return c;
    }
}
