package calculator;

import java.util.Arrays;
import java.util.Calendar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

//        String n = "//;\n1;2;3";
        String n = InputSystem.getInstance().input();
        Separator separator = new Separator(n);
//        System.out.println(Arrays.toString(separator.findNumbers()));

        Numbers numbers = new Numbers(n, separator);
        Calculator calculator = new Calculator(numbers.setNumbers());
//        System.out.println(Arrays.toString(numbers.setNumbers()));

        System.out.println(calculator.plus());





    }
}
