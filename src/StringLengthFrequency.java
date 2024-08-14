import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLengthFrequency {
    public List<String> LengthFrequency(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new ArrayList<>();
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (String index : strings) {
            int length = index.length();
            if (count.containsKey(length)) {
                count.put(length, count.get(length) + 1);
            } else {
                count.put(length, 1);
            }
        }

        int countFrequency = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > countFrequency) {
                countFrequency = entry.getValue();
                maxFrequency = entry.getKey();
            }
        }

        List<String> result = new ArrayList<>();
        for (String variable : strings) {
            if (variable.length() == maxFrequency) {
                result.add(variable);
            }
        }
        return result;
    }

}
