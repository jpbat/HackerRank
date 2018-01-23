#include <stdio.h>
#include <math.h>

long long DPi[200][20];
long long DPd[200][20];

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

unsigned long long increasingFunction(int i, int k)
{
    int j;
    unsigned long long res = 0;

    if (DPi[i][k] != -1)
        return DPi[i][k];

    for (j = k; j <= 9; j++)
        res += increasingFunction(i - 1, j);

    DPi[i][k] = res;
    return res;
}


unsigned long long decreasingFunction(int i, int k)
{
    int j;
    unsigned long long res = 0;

    if (DPd[i][k] != -1)
        return DPd[i][k];

    for (j = k; j >= 0; j--)
        res += decreasingFunction(i - 1, j);

    DPd[i][k] = res;
    return res;
}


unsigned long long countNonBouncies(int totalLength)
{
    int i, j;

    for (i = 0; i < 110; i++)
        for (j = 0; j < 10; j++)
        {
            DPi[i][j] = -1;
            DPd[i][j] = -1;
        }


    for (i = 1; i < 10; i++)
    {
        DPi[1][i] = 1;
        DPd[1][i] = 1;
    }

    for (i = 1; i < 110; i++)
        DPd[i][0] = 1;

    long long sumIncreasing = 0;
    long long sumDecreasing = 0;

    for (i = 1; i <= totalLength; i++)
    {
        for (j = 1; j <= 9; j++)
        {
            sumIncreasing += increasingFunction(i, j);
            sumDecreasing += decreasingFunction(i, j);
        }
    }

    long long both = 9 * totalLength;
    long long totalSum = sumIncreasing + sumDecreasing - both;
    return totalSum;
}

void solve(long double targetRatio)
{
    int i;
    long double ratio;
    long double previousBouncies, bouncies = 0;
    unsigned long long previousNumber, number = 100, step;

    // printf("target ratio: %Lf\n", targetRatio);

    for (i = 3; ; i++)
    {
        previousNumber = number;
        previousBouncies = bouncies;
        number = (unsigned long long) pow(10, i);
        // printf("counting bouncies for 10^%d\n", i);
        bouncies = number - countNonBouncies(i) - 1;
        ratio = bouncies / (long double) number;
        // printf("got a ratio of %Lf\n", ratio);

        if (ratio >= targetRatio)
        {
            number = previousNumber;
            bouncies = previousBouncies;
            break;
        }
    }

    if (ratio == targetRatio)
    {
        printf("%llu\n", number);
        return;
    }
    ratio = 0;

    // printf("starting on %llu\n", number);

    while (ratio < targetRatio)
    {
        if (isBouncy(number))
            bouncies++;
        ratio = bouncies / (long double) number;
        // step = (unsigned long long) number * (targetRatio - ratio);
        number++;
        // printf("Ratio: %Lf\tTarget: %Lf\tBouncies: %Lf\tNumber: %llu\tStep: %llu\n", ratio, targetRatio, bouncies, number, step);
    }
    printf("%llu\n", number - 1);
}


int main(int argc, char **argv)
{
    int i, testCases;
    long double n, m;

    scanf("%d", &testCases);

    for (i = 0; i < testCases; i++)
    {
        scanf("%Lf %Lf", &n, &m);
        solve(n / m);
    }

    return 0;
}