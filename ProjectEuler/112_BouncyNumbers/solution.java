import java.util.*;
import java.math.*;

public class solution {

    static long[][] DPi;
    static long[][] DPd;

    static long f_increasing(int i, int k) {
        long res = 0;

        if (DPi[i][k] != -1)
            return DPi[i][k];

        for (int j = k; j <= 9; j++)
            res += f_increasing(i - 1, j);

        DPi[i][k] = res;
        return res;
    }

    static long f_decreasing(int i, int k) {
        long res = 0;

        if (DPd[i][k] != -1)
            return DPd[i][k];

        for (int j = k; j >= 0; j--)
            res += f_decreasing(i - 1, j);

            DPd[i][k] = res;
        return res;
    }

    static long countNonBouncies(int totalLength)
    {
        DPi = new long[110][10];
        for (long[] is : DPi)
            Arrays.fill(is,-1);
        for (int i = 1; i <= 9; i++)
            DPi[1][i] = 1;

        DPd = new long[110][10];
        for (long[] is : DPd)
            Arrays.fill(is,-1);
        for (int i = 1; i <= 9; i++)
            DPd[1][i] = 1;
        for (int i = 1; i < 110; i++)
            DPd[i][0] = 1;

        long sumIncreasing = 0;
        long sumDecreasing = 0;

        for (int i = 1; i <= totalLength; i++) {
            for (int k = 1; k <= 9; k++) {
                sumIncreasing += f_increasing(i, k);
                sumDecreasing += f_decreasing(i, k);
            }
        }

        long both = 9 * totalLength;
        long totalSum = sumIncreasing + sumDecreasing - both;
        return totalSum;
    }

    void solve(double targetRatio) {
        double ratio;
        long previousBouncies, bouncies;
        long previousNumber, number;

        for (int i = 3; ; i++) {
            previousNumber = number;
            previousBouncies = bouncies;

            number = Math.pow(10, i);

            bouncies = number - (BigInteger)countNonBouncies(i) - 1;

            ratio = bouncies / number;
        }
    }

    public static void main(String[] args){
        BigDecimal nonBouncies = countNonBouncies(100);
    }
}