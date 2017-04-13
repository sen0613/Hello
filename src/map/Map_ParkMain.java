package map;

import map.model.Park;
import map.service.ParkService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Map_ParkMain {
    public static void main(String[] args) {

        Map<String, Park> map = new HashMap<>();
        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("src\\Parks.csv"));

            br.readLine(); // SKIP THE FIRST LINE

            String line = "";
            while ((line = br.readLine()) != null) {
                String[] splitted = line.split(",");

                map.put(splitted[0],
                        new Park(splitted[1],splitted[2],splitted[3],splitted[4],splitted[5]));
            }

            System.out.println(map.get("BAL07"));

            System.out.println("city: "+map.get("BAL09").getCity());


        } catch (FileNotFoundException fne) {
            System.out.println("파일 이름이 잘못되었거나 없습니다.");

        } catch (IOException ie) {
            System.out.println("파일을 실제로 IO 하다가 에러가 발생했습니다.");
        }

        ParkService service = new ParkService();

        service.validateUserId();
        service.validatePassword();


    }
}





