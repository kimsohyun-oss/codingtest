package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.first.bread.BreadType;
import test.first.bread.Recipe;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

        TestController testController = new TestController();
        testController.createBread(BreadType.CREAM, new Recipe(100, 50, 200));
        testController.calculateNum();
        testController.factorial(4);
        testController.fixStackOverFlow(100);
        testController.pond();
    }
}
