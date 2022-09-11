import java.util.*;

public class MigratoryBird {

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> frequencesMap = new HashMap<>();

        for(Integer type : arr){
            if(frequencesMap.containsKey(type)){
                frequencesMap.put(type, frequencesMap.get(type)+1);
            } else {
                frequencesMap.put(type, 1);
            }
        }

        int maxFrequence = Integer.MIN_VALUE;
        List<Integer> maxFrequenceId = new ArrayList<>();

        for(Map.Entry<Integer, Integer> frequence : frequencesMap.entrySet()){
            if(frequence.getValue() > maxFrequence){
                maxFrequence = frequence.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> frequence : frequencesMap.entrySet()){
            if(frequence.getValue() == maxFrequence){
                maxFrequenceId.add(frequence.getKey());
            }
        }

        Collections.sort(maxFrequenceId);

        return maxFrequenceId.get(0);
    }
}
