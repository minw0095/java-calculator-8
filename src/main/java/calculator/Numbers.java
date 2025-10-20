package calculator;

import java.util.Arrays;
import java.util.List;

public class Numbers {

    private final String numbers;
    private final Separator separator;

    public Numbers(String numbers, Separator separator) {

        this.numbers = numbers;
        this.separator = separator;
    }

    public int[] setNumbers(){

        try {
            return Arrays.stream(separator.findNumbers()
                            .split(separator.findSeparator()))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        }
        catch (Exception e){
            throw new IllegalArgumentException();
        }
    }
}
