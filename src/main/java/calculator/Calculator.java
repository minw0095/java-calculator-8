package calculator;

import java.util.Arrays;

public class Calculator {

    private final int[] numbers;

    public Calculator(int[] number) {
        this.numbers = number;
    }

    public void plus() {
        System.out.println("결과 : " +Arrays.stream(numbers).sum());

    }
}
