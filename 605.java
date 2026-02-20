class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int f = flowerbed.length;
        int count = 0;
        int i = 0;
        while(i < f) 
        {
            if (flowerbed[i] == 0)  
            {
                if ((i > 0 && flowerbed[i - 1] == 1) || (i < (f - 1) && flowerbed[i + 1] == 1) ) 
                {
                   i=i+1; 
                } 
                else 
                {
                    count++;
                    i=i+2;
                }
            } 
            else 
            {
                i=i+2;
            }
        }
        return count >= n;
    }
}
