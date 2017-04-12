package school.service;

import school.model.School;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolService implements ISchoolService {

    public List<School> school (List<School> schoolList) {

        List<School> newArrList = new ArrayList<>();



        for(School e :schoolList) {

            //임시 클래스 생성
            School tempClass = new School();

            if (e.getSchoolID().length() >= 6) {
                tempClass.setSchoolID(e.getSchoolID().substring(0,6) + "...");
            } else {
                tempClass.setSchoolID(e.getSchoolID());
            }

            tempClass.setName_full(e.getName_full());
            tempClass.setState(e.getState());
            tempClass.setCity(e.getCity());
            tempClass.setCountry(e.getCountry());

            newArrList.add(tempClass);
        }

        return newArrList;

    }


}
