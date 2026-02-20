class Solution {
    public boolean isPalindrome(String s) {
       String f = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String t="";
        s=s.trim();
        for(int i=0;i<f.length();i++)
        {
            char k=f.charAt(i);
            t=k+t;
        }
        if(f.equals(t))
        return true;
        else 
        return false;
    }
}
