package calculator;

import java.util.Arrays;

public class Calculator {

    private final int[] numbers;

    public Calculator(int[] number) {
        this.numbers = number;
    }

    public int plus() {
        return Arrays.stream(numbers).sum();
    }
}
