package players;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerMain {
    public static void main(String[] args) throws Exception {



        // 1. data loading from csv
//        FileReader fr = new FileReader("src\\Salaries.csv");
//        BufferedReader br = new BufferedReader(fr);

        BufferedReader br = new BufferedReader(
                new FileReader("src\\Salaries.csv"));

        br.readLine(); // skip the first line

        List<Player> players= new ArrayList<>();
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(",");
            players.add(new Player(
                    splitted[0], splitted[1], splitted[2],
                    splitted[3], Integer.parseInt(splitted[4])));
        }

        System.out.println(players.size());

        // 2. 현재 데이터를 분석해서 결론을 도출
        // 2-1 최대값 구하기

//        PlayerService service = new PlayerService();
        Player player = PlayerService.getHighestSalaryPlayer(players);

//        System.out.printf("%s의 연봉은 %d불 입니다.",
//                player.getPlayerId(),player.getSalary());
        System.out.println(player);
    }
}
