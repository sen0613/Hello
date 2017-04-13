package majorLeague;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 * 1. List<Park>
 * 2. 국가가 US가 아닌 볼파크의 수?
 * 3. 별명이 있는 볼파크의 수?
 * 4. 볼파크의 이름의 글자수의 평균은?
 */
public class FileReaderExample {
    public static void main(String[] args) { //메인을 불러들이는 자바 가상 머신이 예외처리를 해야함

        // 예외처리를 하지 않았을 때 에러가 나는 게 있고 나지 않는 게 있다!!

        /* 예외처리!!
        FileReader fr = null;
        try {
           fr = new FileReader("src\\Parks.csva"); //"fr은 FileReader 형태의 객체다."  //"FileReader는 file을 읽어들이는 놈!"
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없어요.");
            System.exit(0);
        }
        */

        List<Park> parkList = new ArrayList<>(); //list for park object

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("src\\Parks.csva"));
            // "BufferedReader는 FileReader의 helper로, FileReader를 한 번 wrapping해서 사용하기 편하게 만든다."

            br.readLine(); //skip first line

            String line = "";
            while ((line = br.readLine()) != null) {

                //            List<String> splitted = Arrays.asList(line.split(","));
                String[] splitted = line.split(",");

                //            Park p = new Park(splitted[0], splitted[1],
                //                    splitted[2], splitted[3], splitted[4], splitted[5]);
                parkList.add(new Park(splitted[0], splitted[1],
                        splitted[2], splitted[3], splitted[4], splitted[5]));
            }
        } catch (FileNotFoundException fne) {
            System.out.println("파일 이름이 잘못되었거나 없어요.");

        } catch (IOException ie) {
            System.out.println("파일을 실제로 IO하다가 에러가 발생했어요.");
        }

        ParkService service = new ParkService();

        int nonUS = service.theNumberOfNonUSParks(parkList);
        List<Park> haveAlias = service.theNumberOfParksWhichHaveAlias(parkList);
        double mean = service.averageOfParkNameSpelling(parkList);

        System.out.printf("%d, %s, %.1f", nonUS, haveAlias, mean);


    }
}







//            System.out.println(park);
//
//            ParkService service = new ParkService();
//
//            Park list1 = new Park();
//            list1.("ALB01", "Riverside Park", "", "Albany", "NY", "US");


//            String[] splitted = line.split(",");
//            for (String e : splitted) {
//                System.out.println(e);







