class Solution 
{
    public boolean checkRecord(String s) 
    {
        int a=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            char k=s.charAt(i);
            if(k=='A')
            {
                a++;
                if(a>=2)
                return false;
                l=0;
            }
            else if(k=='L')
            {
                l++;
                if(l>=3)
                return false;
            }
            else
            l=0;
        }
        return true;
    }
}
