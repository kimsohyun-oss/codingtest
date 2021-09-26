package test;

import test.fifth.pond.Pond;
import test.first.bread.Bread;
import test.first.bread.BreadFactory;
import test.first.bread.BreadType;
import test.first.bread.Recipe;
import test.fourth.stackoverflow.FixStackOverFlow;
import test.second.calculator.Calculator;
import test.third.factorial.Factorial;

import java.util.List;

public class TestController {

    public Bread createBread(BreadType type, Recipe recipe) {
        Bread bread = BreadFactory.createBread(type, recipe);
        System.out.println("첫번째 문제 result : " + bread);
        return bread;
    }

    public int calculateNum() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4).add(5).subtract(3).out();

        System.out.println("두번째 문제 result : " + result);
        return result;
    }

    public int factorial(int num) {
        Factorial factorial = new Factorial();
        int result = factorial.factorial(num);

        System.out.println("세번째 문제 result : " + result);
        return result;
    }


    // TODO : 데이터 표현범위 초과 해결
    public Long fixStackOverFlow(int bigNum) {
        FixStackOverFlow fixStackOverFlow = new FixStackOverFlow();
        Long result = fixStackOverFlow.fix(bigNum);

        System.out.println("네번째 문제 result :" + result);
        return result;
    }

    public List pond() {
        Pond pond = new Pond();
        List digitalPond = pond.calculate();

        System.out.println("다섯번째 문제 result :");
        for (int i = 1 ; i <= digitalPond.size(); i++) {
            System.out.print(digitalPond.get(i-1));
            if (i%10 == 0) {
                System.out.println("\n");
            }
        }
        return digitalPond;
    }
}
