package players;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerService {

    public static Player getHighestSalaryPlayer(List<Player> list){

        Player highestSalaryPlayer = new Player();

        for(Player e : list) {
            if (e.getSalary() > highestSalaryPlayer.getSalary()) {
                highestSalaryPlayer = e;
            }
        }
        return highestSalaryPlayer;
    }

    public static Player getLowestSalaryPlayer(List<Player> list){return null;}

    public static double getAllPlayersAverageSalary(List<Player> list){return 0.0;}
}
