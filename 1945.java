class Solution 
{
    public int getLucky(String s, int k) 
    {
        String num = "";
        for (char ch : s.toCharArray()) 
        {
            int val=ch - 'a' + 1;
            num=num+val;
        }

        while (k-->0) 
        {
            int sum=0;
            for (int i = 0; i < num.length(); i++) 
            {
                sum=sum+num.charAt(i) - '0';
            }
            num=String.valueOf(sum);
        }

        return Integer.parseInt(num);
    }
}

/*class Solution 
{
    public int getLucky(String s, int k) 
    {
        String num = "";
        for (char ch : s.toCharArray()) 
        {
            int val = ch -'a'+ 1;   
            num=num+val;      
        }
        int sum = 0;
        for (int i = 0; i < num.length(); i++) 
        {
            sum=sum+ num.charAt(i)-'0';
        }
     int val=0;
    while(sum!=0)
    {
        int r=sum/10;
        val=val+r;
        sum=sum%10;
    }
    return val;
    }
}*/
