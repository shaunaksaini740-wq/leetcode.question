class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        Reverse(nums, 0, n - 1);
        Reverse(nums, 0, k - 1);
        Reverse(nums, k, n - 1);
    }
    void Reverse(int[] nums, int s, int e) {
        while (e > s) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}


/*class Solution                 -------->TIME LIMIT EXECUTED
{
    public void rotate(int[] arr, int k) 
    {
        int n=arr.length;
        k=k%n;
        for (int i=0;i<k;i++)
        {
            int last=arr[n-1]; 
            for (int j=n-1;j>0;j--) 
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}*/
