package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputSystem {
    private static final InputSystem instance = new InputSystem();

    private InputSystem () {};

    public static InputSystem getInstance() {
        return instance;
    }

    public String input() {
        return Console.readLine();
    }

}
