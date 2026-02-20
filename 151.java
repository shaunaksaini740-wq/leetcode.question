class Solution {
    public String reverseWords(String s) 
    {
        String st=s+" ";
        String t="";
        String result="";
        for (int i=0;i<st.length();i++)  //the sky is blue 
        {
            char k=st.charAt(i);
            if(k!=' ')
            {
              t=t+k;
            }
            else 
            {
                if(!t.isEmpty())
                {
                result=t+" "+result;
                t="";
                }
            }
        }
        result=result.trim();
        return result;
    }
}
