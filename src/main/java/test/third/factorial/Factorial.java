package test.third.factorial;

public class Factorial {
    int result;
    public int factorial(int num) {
        this.result = num;

        if (num <= 1) {
            return 1;
        }
        return result * factorial(num - 1);
    }
}
