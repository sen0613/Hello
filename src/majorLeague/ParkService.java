package majorLeague;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService {
    //1
    public int theNumberOfNonUSParks(List<Park> list) {
        int sumOfNonUSParks = 0;
        for (Park e : list) {
            if (e.getCountry().contains("US")){
                sumOfNonUSParks++;
            }
        }
        //출력
        int result = sumOfNonUSParks++;
        return result;
    }

    //2
    public void theNumberOfParksWhichHaveAlias(List<String> park) {
        int theNumberOfParksWhichHaveAlias = 0;
        for (String e : park) {

        }
    }
}
