package majorLeague2.service;

import majorLeague2.model.Park;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService implements IParkService {
    //1
    public int theNumberOfNonUSParks(List<Park> parkList) {

        int USCnt = 0;
        for (Park e : parkList) {
            if (e.getCountry().equals("US")){
                USCnt++;
            }
        }
        //출력
        return USCnt;
    }

    //2
    public List<Park> theNumberOfParksWhichHaveAlias(List<Park> parkList) {
        List<Park> newList = new ArrayList<>();

        for (Park e : parkList) {
            if(!e.getParkAlias().equals("US")) {
                newList.add(e);
            }
        }
        return newList;
    }

    //3
    public double averageOfParkNameSpelling(List<Park> parkList) {

        int totalParkNameLength = 0;
        for (Park e : parkList) {
            totalParkNameLength += e.getParkName().length();
        }
        return (double) totalParkNameLength / parkList.size();
    }
}
