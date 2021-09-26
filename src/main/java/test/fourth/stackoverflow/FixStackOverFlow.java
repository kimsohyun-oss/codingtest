package test.fourth.stackoverflow;

public class FixStackOverFlow {

    public long fix(int num) {
        return factorialTail(num, 1);
    }
    public long factorialTail(int num, int result) {
        if(num == 1) return result;
        return factorialTail(num - 1, result * num);
    }
}
