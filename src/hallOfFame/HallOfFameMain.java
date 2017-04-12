package hallOfFame;
import players.Player;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 * * 1. HallOfFame 객체를 PlayerAverage로 변환하여 'playerId'와 'ballots, needed, votes 세 개의 평균'을 객체에 저장하기
 */
public class HallOfFameMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src\\HallOfFame.csv"));

        br.readLine(); // skip the first line

        // Array List 이름 : halls
        List<HallOfFame> halls = new ArrayList<>();

        String line = "";
        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(",");

            // while 문 안에서만 돌아가는 임시 객체: fame
            HallOfFame fame = new HallOfFame();

            fame.setPlayerID(splitted[0]);
            fame.setBallots(NullUtil.parseIn(splitted[3]));
            fame.setNeeded(NullUtil.parseIn(splitted[4]));
            fame.setVotes(
                    splitted[5].equals("") ? 0 : Integer.parseInt(splitted[5]));

//
//            // Player ID
//            fame.setPlayerID(splitted[0]);
//
//            // Ballots
//            if (splitted[3].equals("")) {
//                fame.setBallots(0);
//            } else {
//                fame.setBallots(Integer.parseInt(splitted[3]));
//            }
//
//
//            // Needed
//            if (splitted[4].equals("")) {
//                fame.setNeeded(0);
//            } else {
//                fame.setNeeded(Integer.parseInt(splitted[4]));
//            }
//
//
//            // Votes
//            if (splitted[5].equals("")) {
//                fame.setVotes(0);
//            } else {
//                fame.setVotes(Integer.parseInt(splitted[5]));
//            }

            // 객체 하나로 만들어주는 것
                halls.add(fame);

            }


            // mapping할 ArrayList
        // HallOfFame --> PlayerAverage
        List<PlayerAverage> newList = new ArrayList<>();

        for (HallOfFame e : halls) {

            // for문 안에서만 작동하는 임시 객체(class): tempArrList
            PlayerAverage tempArrList = new PlayerAverage();

            tempArrList.setPlayerId(e.getPlayerID());
            tempArrList.setAverage((e.getBallots()+e.getNeeded()+e.getVotes())/3);

            newList.add(tempArrList);

        }

        System.out.println(newList.size());
        System.out.println(newList.get(2000));
        System.out.println(newList.get(1991));
        System.out.println(newList);


        }
    }


