package majorLeague2.service;

import majorLeague2.model.Park;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public interface IParkService {

    int theNumberOfNonUSParks(List<Park> list);
    List<Park> theNumberOfParksWhichHaveAlias(List<Park> parkList);
    double averageOfParkNameSpelling(List<Park> parkList);
}
