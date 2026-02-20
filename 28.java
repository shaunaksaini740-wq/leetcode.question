class Solution 
{
    public int strStr(String hay, String need) 
    {
        if (need.length() == 0)
            return 0;
        for (int i = 0; i <= hay.length() - need.length(); i++) 
        {
            int j=0;
            for(;j < need.length() &&
                    hay.charAt(i + j) == need.charAt(j);)
                    {
                        j++;
                    }

            if (j == need.length())
                return i;
        }
        return -1;
    }
}
