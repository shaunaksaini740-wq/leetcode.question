//2894
int differenceOfSums(int n, int m)
 {
    int n1=0,n2=0;
    int i=1;
    while (i<=n) 
    {
        if (i%m==0)
        {
            n2=n2+i;
        }
        else
        {
            n1=n1+i;
        }
        i++;
    }
    return n1-n2;
}
