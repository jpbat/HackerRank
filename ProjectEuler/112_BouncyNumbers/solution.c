#include <stdio.h>

int isBouncy(unsigned long long number)
{
    int isIncreasing  = 1;
    int isDecreasing = 1;

    int next, last = number % 10;
    number /= 10;

    while (number > 0)
    {
        next = number % 10;

        isDecreasing &= last >= next;
        isIncreasing  &= last <= next;

        if (!isIncreasing && !isDecreasing)
            return 1;

        number /= 10;
        last = next;
    }

    return 0;
}

void solve(long double targetRatio)
{
    long double ratio = 0;
    long double bouncies = 0;
    unsigned long long number;

    for (number = 0; number < 1000; number++)
    {
        if (isBouncy(number))
            bouncies++;
        printf("%llu %Lf\n", number, bouncies);
    }

    // for (number = 100; ratio < targetRatio; number++)
    // {
    //     if (isBouncy(number))
    //         bouncies++;
    //     ratio = bouncies / (long double) number;
    //     // printf("Ratio: %Lf\tTarget: %Lf\tBouncies: %Lf\tNumber: %llu\n", ratio, targetRatio, bouncies, number);
    // }
    // printf("%llu\n", number - 1);
}

unsigned long long cenas(int n, int k)
{
    int i;
    unsigned long long result;

    k = k > (n - k) ? (n - k) : k;

    for (i = 1; i <= k; i++)
    {
        result *= n - k + i;
        result /= i;
    }

    return result;
}

void solveV2(long double targetRatio, int test)
{
    unsigned long long nonBouncies = cenas(test + 1, 10) + cenas(test + 9, 9) - 10 * test - 2;
    printf("There are %llu non-bouncy numbers below 10^%d\n", nonBouncies, test);
}

int main(int argc, char **argv)
{
    int i, testCases;
    long double n, m;

    scanf("%d", &testCases);

    for (i = 0; i < 100; i++)
    {
        scanf("%Lf %Lf", &n, &m);
        // solveV2(n / m, i);
    }

    solve(0);

    return 0;
}