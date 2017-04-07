package gourmet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetReview {
    public static void main (String[] args) {

        // 맛집 객체를 5개 만든다.
        Gourmet spoon = new Gourmet();
        spoon.title = "숟가락반상 마실";
        spoon.mainMenu = "한정식, 떡갈비, 갈비찜";
        spoon.score = 111;

        Gourmet sushi = new Gourmet();
        sushi.title = "스시메이진";
        sushi.mainMenu = "스시, 스시뷔페";
        sushi.score = 70;

        Gourmet chan = new Gourmet();
        chan.title = "맛찬들";
        chan.mainMenu = "삼겹살, 한우, 목살";
        chan.score = 49;

        Gourmet choi = new Gourmet();
        choi.title = "최우영스시";
        choi.mainMenu = "초밥, 회전초밥";
        choi.score = 49;

        Gourmet ranch = new Gourmet();
        ranch.title = "철판목장";
        ranch.mainMenu = "스테이크, 철판, 함박스테이크";
        ranch.score = 46;


        // 맛집 객체를 리스트에 담는다.
        List<Gourmet> list = new ArrayList<>();
        list.add(spoon) ;
        list.add(sushi);
        list.add(chan);
        list.add(choi);
        list.add(ranch);

        /* 1. 맛집 점수의 평균 구하기 */
        int totalScore = 0;


        for (Gourmet a : list) {
            totalScore += a.score;
        }

        System.out.printf("점수 평균은 %f 입니다. ",
                (double)totalScore / list.size() );






    }
}
