class Solution 
{
    public int myAtoi(String s) 
    {
        if (s == null || s.equals("")) 
        {
            return 0;
        }  
        else if (Character.isLetter(s.charAt(0))) 
        {
            return 0;
        }
        else 
        {
            String st = "";
            for (int i = 0; i < s.length(); i++) 
            {
                char k = s.charAt(i);
                if (!Character.isLetter(k))
                    st = st + k;
                else
                    break;
            }
            st = st.trim();
            int decimalIndex = st.indexOf('.');
            if (decimalIndex != -1) 
            {
                st = st.substring(0, decimalIndex);
            }
            if (st.length() == 0) 
            return 0;
            int i = 0;
            int sign = 1;
            long val = 0;
            if (st.charAt(0) == '+' || st.charAt(0) == '-') 
            {
                sign = (st.charAt(0) == '-') ? -1 : 1;
                i++;
            }
            while (i < st.length()) 
            {
                char c = st.charAt(i);
                if (!Character.isDigit(c)) 
                break;
                int digit = c - '0';
                if (val > (Integer.MAX_VALUE - digit) / 10) 
                {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                val = val * 10 + digit;
                i++;
            }
            val = val * sign;
            return (int) val;
        }
    }
}
/*class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        s = s.trim();
        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Process characters
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Handle integer overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}*/

