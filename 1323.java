class Solution {
    public int maximum69Number (int n) {
        int f=n, h=1, l=0;
    while(f>0){
        if(f%10==6)
            l=h;
        f=f/10;
        h=h*10;
    }
    if(l>0)
        return n+3*l;
    return n;
    }
}
