import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HackerRankPickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        Map<Integer, Integer> numbers = new TreeMap<>();
        for (int key : a) {
            if (!numbers.containsKey(key)) {
                numbers.put(key, 1);
            } else {
                numbers.put(key, numbers.get(key) + 1);
            }
        }
        int maxValue = Integer.MIN_VALUE;

        List<Integer> keys = new ArrayList<>(numbers.keySet());

        if (keys.size() == 1) {
            maxValue = numbers.get(keys.get(0));
        }

        for (int j = 0; j < keys.size() - 1; j++) {
            if (keys.get(j + 1) - keys.get(j) == 0 ||
                    Math.abs(keys.get(j + 1) - keys.get(j)) == 1) {
                int value =
                        numbers.get(keys.get(j + 1)) + numbers.get(keys.get(j));
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            if (numbers.get(keys.get(j)) > maxValue) {
                maxValue = numbers.get(keys.get(j));
            }
        }

        return maxValue;
    }
}
