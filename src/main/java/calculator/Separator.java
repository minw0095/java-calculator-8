package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Separator {

    private final String numbers;

    public Separator(String numbers) {
        this.numbers = numbers;
    }

    public String findSeparator(){
        Pattern pattern = Pattern.compile("//(.*?)\\\\n");
        Matcher matcher = pattern.matcher(numbers);

        if (matcher.find()) {
            System.out.println(matcher.group(1).trim());
            return "[,:" +matcher.group(1).trim() + "]";
        }

        return "[,:]";
    }

    public String findNumbers(){
//        return numbers.split("//(.*?)\\n");
        Pattern pattern = Pattern.compile("//.*?\\\\n(.+)$");
        Matcher matcher = pattern.matcher(numbers);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return numbers;
    }

}
