class Solution 
{
    public int dominantIndex(int[] nums) 
    {
        int index=0;
        int ind=nums[0];
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]>ind)
          {
            ind=nums[i];
            index=i;
          }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(i!=index && ind<2*nums[i])
            {
                return -1;
            }
        }
        return index;
    }
}
