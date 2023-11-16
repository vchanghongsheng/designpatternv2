package com.tuling.designpattern.strategy.v0;

/**
 * 策略模式
 */
public class StrategyTest {


    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1, 2));

        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(1, 2));
    }

}


interface Strategy {
    public int doOperation(int num1, int num2);
}


class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}


class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}







