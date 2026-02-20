//2652
int sumOfMultiples(int n) 
{
    int s=0;
    if(n==0)
    {
    return 0;
    }
    else
    {
for(int i =3;i<=n;i++)
{
    if(i%3==0||i%5==0||i%7==0)
    {
        s=s+i;
    }
}
    }
    return s;
}
