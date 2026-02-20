class Solution 
{
    public void moveZeroes(int[] nums)
    {
        int in=0;
        for(int i:nums)
         {
            if(i!=0) 
            {
                nums[in]=i;
                in++;
            }
        }
        while(in<nums.length) 
        {
            nums[in]=0;
            in++;
        }
    }
}
