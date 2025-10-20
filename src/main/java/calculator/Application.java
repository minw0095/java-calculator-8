package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String n = InputSystem.getInstance().input();
        Separator separator = new Separator(n);

        Numbers numbers = new Numbers(n, separator);
        Calculator calculator = new Calculator(numbers.setNumbers());

        System.out.println(calculator.plus());

    }
}
