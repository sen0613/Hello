package school;

import majorLeague2.model.Park;
import school.model.School;
import school.service.SchoolService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolMain {
    public static void main(String[] args) throws Exception {

        // 입력 : 메모장에 있는 값들을 불러와서 schoolList에 저장
        FileReader fr = new FileReader("src\\Schools.csv");

        BufferedReader br = new BufferedReader(fr);


        List<School> schoolList = new ArrayList<>(); //list for School object
        br.readLine(); //skip first line

        String line = "";

        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(",");

            schoolList.add(new School(splitted[0], splitted[1],
                    splitted[2], splitted[3], splitted[4]));
        }


        // 2. 처리

        SchoolService service = new SchoolService();

        List<School> newArrList = service.school(schoolList);

        for (School e : newArrList) {
            System.out.println(e.getSchoolID());
        }


        //System.out.println(newArrList);
    }
}
