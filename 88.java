class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int c=m+n;
        int[] a=new int[c];
        for (int i=0;i<m;i++) 
        {
            a[i]=nums1[i];
        }
        for (int i=0;i<n;i++) 
        {
            a[m+i]=nums2[i];
        }
        for (int i=0;i<a.length;i++) 
        {
            int temp=a[i];
            int j=i-1;
            while (j>=0 && a[j]>temp) 
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for (int i=0;i<c;i++) 
        {
            nums1[i]=a[i];
        }
    }
}
