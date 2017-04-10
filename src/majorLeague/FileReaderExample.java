package majorLeague;



import member.Member;
import member.MemberService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 * 1. List<Park>
 * 2. 국가가 US가 아닌 볼파크의 수?
 * 3. 별명이 있는 볼파크의 수?
 * 4. 볼파크의 이름의 글자수의 평균은?
 */
public class FileReaderExample {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr);

        String line = "";

        List<Park> parklist = new ArrayList();

        while ((line=br.readLine()) != null) {

            //List<String> park = Arrays.asList(line);
            String[] splitted = line.split(",");


            Park ppp = new Park(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);


            parklist.add(ppp);
        }

            ParkService service= new ParkService();
            int result = service.theNumberOfNonUSParks(parklist);  //1번 호출

            System.out.printf("국가가 US가 아닌 볼파크의 수는 %d 입니다. \n", result);




//            System.out.println(park);
//
//            ParkService service = new ParkService();
//
//            Park list1 = new Park();
//            list1.("ALB01", "Riverside Park", "", "Albany", "NY", "US");


//            String[] splitted = line.split(",");
//            for (String e : splitted) {
//                System.out.println(e);
        }

    }




