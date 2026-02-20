class Solution 
{
    public int[] sortArrayByParity(int[] a) 
    {
        int n=a.length-1;
        for (int i=0;i<=n;i++)
        {
            if(a[i]%2!=0)
            {
              int temp=a[i];
              a[i]=a[n];
              a[n]=temp;
              n--;
              i--;
            }
        }
        return a;
    }
}
