import java.util.Arrays;
import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int numberOfArrivedStudent = 0;
        for(Integer time: a){
            if(time <= 0){
                numberOfArrivedStudent ++;
            }
        }
        return numberOfArrivedStudent >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(-36, 14, -60, 28, -50, 56, 94, -99, -39, 28, 0, -47, 59, -35, 39, 15, -4,
                -49, 85, -43, -77, 38, -49, -67, 92, -43, 29, 82, 41, -26, 61, 60, -23, -81, -90, -96, -77, 90,
                24, -14, 5, 12, 0, 26, 16, 78, -46, 47, 51, 31);

        angryProfessor(26, a);
    }
}
