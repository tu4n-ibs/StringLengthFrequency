import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "!", "python", "is", "fun"};
        StringLengthFrequency stringLengthFrequency = new StringLengthFrequency();
        List<String> result = stringLengthFrequency.LengthFrequency(strings);
        System.out.println(result);
    }
}