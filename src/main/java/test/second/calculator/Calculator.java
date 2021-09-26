package test.second.calculator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
    private int result = 0;

    public Calculator add(int num) {
        result = result + num;
        return new Calculator(result);
    }

    public Calculator subtract(int num) {
        result = result - num;
        return new Calculator(result);
    }

    public int out() {
        return result;
    }
}
