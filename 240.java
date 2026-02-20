class Solution 
{
    public boolean searchMatrix(int[][] arr, int target) 
    {
        if(arr== null || arr.length==0 || arr[0].length==0)
        {
            return false;
        }
        int n = arr.length;
        int m = arr[0].length;
        int row = 0, col = m-1;
        while(row<n && col>=0)
        {
            if(arr[row][col]==target)
            {
                return true;
            }
            else if(arr[row][col]<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return false;
    }
}

/*class Solution 
{
    public boolean searchMatrix(int[][] a, int target) 
    {
        int r=a.length;          
        int c=a[0].length;
        int[] arr = new int[r * c];
        int index=0;
        for (int i=0; i<r; i++) 
        {
            for (int j=0; j<c; j++) 
            {
                arr[index++]=a[i][j];
            }
        }
        Arrays.sort(arr);
        index=0;
        for (int i=0; i<r; i++) 
        {
            for (int j=0; j<c; j++) 
            {
                a[i][j]=arr[index++];
            }
        }
        int start=0;
        int end=(r*c)-1;
         while (start<=end) 
         {
            int mid = start + (end-start)/2; 
            int midRow=mid/c;
            int midCol=mid%c;

            if (a[midRow][midCol]==target) 
            {
                return true;
            } else if (a[midRow][midCol]<target) 
            {
                start=mid+1;
            } else 
            {
                end=mid-1;
            }
        }
        return false;
    }

}*/



