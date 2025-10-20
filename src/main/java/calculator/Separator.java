package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Separator {

    private final String numbers;

    public Separator(String numbers) {
        this.numbers = numbers;
    }

    private Matcher createCustomMatcher(String regex, String numbers) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(numbers);
    }

    public String findSeparator(){
        Matcher matcher  = createCustomMatcher("//(.*?)\\\\n", numbers);

        if (matcher.find()) {
            System.out.println(matcher.group(1).trim());
            return "[,:" +matcher.group(1).trim() + "]";
        }

        return "[,:]";
    }

    public String findNumbers(){
        Matcher matcher  = createCustomMatcher("//.*?\\\\n(.+)$", numbers);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return numbers;
    }

}
