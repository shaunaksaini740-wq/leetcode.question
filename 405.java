class Solution {
    public String toHex(int n) {
        String st="";
        int r;
        do{
            r=n & 15;
            if(r==10)
            st='a'+st;
            else if(r==11)
            st='b'+st;
            else if(r==12)
            st='c'+st;
            else if(r==13)
            st='d'+st;
            else if(r==14)
            st='e'+st;
            else if(r==15)
            st='f'+st;
            else
            st=r+st;
            n=n >>> 4;
        }
        while(n!=0);
        return st;
    }
}
