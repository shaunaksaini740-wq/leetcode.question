#include <stdio.h>
#include <stdbool.h>

// Function to check if a number is prime
bool isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

// Function to count primes less than n
int countPrimes(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime(i)) {
            count++;
        }
    }
    return count;
}

int main() {
    int n;
    printf("Enter an integer: ");
    scanf("%d", &n);
    printf("Number of primes less than %d is %d\n", n, countPrimes(n));
    return 0;
}
