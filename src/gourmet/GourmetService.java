package gourmet;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 *
 * 맛집 점수의 평균을 구하는 메소드 (설계도)
 * 메소드 이름: calcAverageScore
 * 파라미터 : List<Gourmet>
 *
 */
public class GourmetService {
    public double calcAverageScore (List<Gourmet> gourmetlist) {

        int totalScore = 0;


        for (Gourmet e : gourmetlist) { // Gourmet 클래스에서 가져왔기 때문에 형식은 'Gourmet'
            totalScore += e.getScore();
        }

        //출력
        double result = (double) totalScore / gourmetlist.size();

        return result;
    }
}
