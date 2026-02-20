int divide(int di, int d) {
    long res = (long) di/d;
    if(res > INT_MAX) res = INT_MAX;
    if(res < INT_MIN) res = INT_MIN;
    return (int) res;
}
