//202
bool isHappy(int n) {
    int sum = 0;
    
    if (n == 1 || n == 7) {
        return true;
    } else if (n < 10) {
        return false;
    } else {
        for (; n > 0; n = n / 10) {
            int digit = n % 10;
            sum =sum+ digit * digit;
        }
        return isHappy(sum);
    }
}
