bool search(int* nums, int n, int target) {
    for(int i=0; i<n ;i++)
        {
            if(nums[i]==target)
            return true;
        }
        return false;
}
