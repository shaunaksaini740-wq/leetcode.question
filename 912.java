class Solution {
    public int[] sortArray(int[] a) {
        for(int i=0;i<a.length;i++)
        {
         int temp=a[i];
         int j=i-1;
         while(j>=0 && a[j]>temp)
         {
            a[j+1]=a[j];
            j--;
         }
         a[j+1]=temp;
        }
        return a;
    }
}





/*BUBBLE SORT

for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j+1]<a[j])
                {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        }
        return a; */
