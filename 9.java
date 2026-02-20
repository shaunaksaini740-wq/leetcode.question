class Solution {
    public boolean isPalindrome(int x) 
    {
        int t=x;
        int s=0;
        if(x<0)
        return false;
        while(x!=0)
        {
            int r=x%10;
            s=s*10+r;
            x=x/10;
        }
        if(s==t)
        return true;
        else 
        return false;
    }
}
