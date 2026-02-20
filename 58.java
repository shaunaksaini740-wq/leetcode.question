class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        for (int i = s.length() - 1; i >= 0; i--)
        {  
             char k=s.charAt(i);
             if(k==' ')
             break;
             c++;
        }
        return c;
    }
}
