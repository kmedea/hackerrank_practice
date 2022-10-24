import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class BeautifulDaysAtTheMovies {

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int numberOfBeautifulDays = 0;
        int day = i;
        for(int f = 0; f <= j-i; f++){
            StringBuilder thisDay = new StringBuilder();
            thisDay.append(Integer.toString(day));
            String reverseDay = thisDay.reverse().toString();
            int reverse = Integer.parseInt(reverseDay);
            if(Math.abs(reverse - day) % k == 0){
                numberOfBeautifulDays++;
            }
            day++;
        }
        return numberOfBeautifulDays;
    }

    public static void main(String[] args) {
        beautifulDays(20, 23, 6);

        System.out.println("m" +null );
    }


}
