class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int p=-1;
        int k=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    p=i;
                    k=j;
                    break;
                }
            }
        }
        arr[0]=p;
        arr[1]=k;
        return arr;
    }
}
