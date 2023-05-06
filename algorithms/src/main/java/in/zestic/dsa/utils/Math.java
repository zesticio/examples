package in.zestic.dsa.utils;

public class Math {

    public Integer findSum(Integer n) {
        return n * (n + 1) / 2;
    }

    public Integer findSum02(Integer n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
