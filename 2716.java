class Solution 
{
    public int minimizedStringLength(String s) 
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            boolean check=true;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    check=false;
                    break;
                }
            }
            if(check)
            {
                count++;
            }
        }
        return count;
    }
}
