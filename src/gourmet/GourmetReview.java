package gourmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetReview {
    public static void main (String[] args) {

        // 맛집 객체를 5개 만든다.
        Gourmet spoon = new Gourmet();
        System.out.println("이 라인은 생성자 호출 바로 후에 실행될 거예요.");

        spoon.setTitle("숟가락반상 마실");
        spoon.setMainMenu("한정식, 떡갈비, 갈비찜");
        spoon.setScore(111);


        Gourmet sushi = new Gourmet();
        System.out.println("이 라인은 생성자 호출 바로 후에 실행될 거예요.");

        sushi.setTitle("스시메이진");
        sushi.setMainMenu("스시, 스시뷔페");
        sushi.setScore(70);

        Gourmet chan = new Gourmet();
        System.out.println("이 라인은 생성자 호출 바로 후에 실행될 거예요.");

        chan.setTitle("맛찬들");
        chan.setMainMenu("삼겹살, 한우, 목살");
        chan.setScore(49);

        Gourmet choi = new Gourmet();
        System.out.println("이 라인은 생성자 호출 바로 후에 실행될 거예요.");

        choi.setTitle("최우영스시");
        choi.setMainMenu("초밥, 회전초밥");
        choi.setScore(49);

        Gourmet ranch = new Gourmet();
        System.out.println("이 라인은 생성자 호출 바로 후에 실행될 거예요.");

        ranch.setTitle("철판목장");
        ranch.setMainMenu("스테이크, 철판, 함박스테이크");
        ranch.setScore(46);


        Gourmet yongho = new Gourmet("용호낙지", "낙새, 낙곱새", 46);


        // 맛집 객체를 리스트에 담는다.
        List<Gourmet> list = Arrays.asList(
                spoon, sushi, chan, choi, ranch
        );

//        list.add(spoon);
//        list.add(sushi);
//        list.add(chan);
//        list.add(choi);
//        list.add(ranch);

        /* 1. 맛집 점수의 평균 구하기 */
        GourmetService service = new GourmetService();

        double average = service.calcAverageScore(list);



        System.out.printf("맛집 점수의 평균은 %.2f 입니다. ", (double)average);




        Gourmet g1 = new Gourmet("a", "b", 25);
        Gourmet g2 = new Gourmet("a", "b", 30);

        g1.getScore();
        g2.getScore();


        // 함수: 입력 값이 같으면 항상 결과가 같음
        // 메소드: 입력 값이 같아도 다른 결과가 나오는 경우가 있음









    }
}
