//7
int reverse(int x) {
    int res = 0;
    for (; x != 0; x /= 10) {
        int rem = x % 10;
        if ((res > INT_MAX / 10) || (res < INT_MIN / 10))
        {
            return 0;
        }
        res = res * 10 + rem;
    }
    return res;
}
