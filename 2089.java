class Solution 
{
    public String sortSentence(String s) 
    {
        String[] ar= s.split(" ");
        String[] neww = new String[ar.length];
        for (int i=0;i<ar.length;i++) 
        {
            String arr= ar[i]; 
            int position=arr.charAt(arr.length()-1)-'0';
            neww[position - 1]=arr.substring(0,arr.length()-1);
        }

        return String.join(" ",neww);
    }
}
