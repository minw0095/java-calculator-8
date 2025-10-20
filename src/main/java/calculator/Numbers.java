package calculator;

import java.util.Arrays;
import java.util.List;

public class Numbers {

    private final int[] numbers;
    private final Separator separator;

    public Numbers(Separator separator) {
        this.separator = separator;
        this.numbers = setNumbers();
        checkPositive();
    }

    private int[] setNumbers(){

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

    public int[] getNumbers() {
        return setNumbers();
    }

    public void checkPositive() {
        if(Arrays.stream(numbers).anyMatch(e->e<0)){
            throw new IllegalArgumentException();
        }
    }

}
