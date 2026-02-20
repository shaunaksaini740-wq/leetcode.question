bool isFascinating(int n) 
{
   int arr[9]={0},t=n;
   while(t)
   {
    if(t%10==0)
    return false;
    arr[(t%10)-1]++;
    t/=10;
   }
   t=2*n;
   while(t)
   {
    if(t%10==0)
    return false;
     arr[(t%10)-1]++;
    t/=10;
   }
   t=3*n;
   while(t)
   {
    if(t%10==0)
    return false;
     arr[(t%10)-1]++;
    t/=10;
   }
   for(int i=0;i<9;i++)
   {
    if(arr[i]!=1) 
    return false;
   }
   return true;
}
