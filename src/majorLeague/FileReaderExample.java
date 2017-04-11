package majorLeague;
import java.io.BufferedReader;
import java.io.FileReader;
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
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr);


        List<Park> parkList = new ArrayList<>(); //list for park object
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







