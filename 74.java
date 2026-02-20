class Solution 
{
    public boolean searchMatrix(int[][] a, int target) 
    {
        int r= a.length;          
        int c;
        if (r>0) 
        {
            c= a[0].length;
        } else 
        {
            c= 0;
        }

        for (int i=0; i<r; i++)
        {
            for (int j=0; j<c; j++) 
            {
                if (a[i][j]==target)
                    return true;
            }
        }
        return false;
    }

}
