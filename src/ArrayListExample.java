
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExample {
    public static void main(String[] args) {

        String review =
                "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게 " +
                        "먹고온 구로 초밥뷔페를 추천해드리려고하는데요!! " +
                        "구로 초밥뷔페집의 이름은 스시메이진이라는 곳이에요^^♥";

        // 1. review 스트링을 리스트로 변환
        // 공백을 기준으로 분리(공백을 딜리미터로 분리)

        // 1-1 스트링을 분해해서 스트링의 배열로 만든다.

        String[] splitted = review.split(" ");
        List<String> wordList = Arrays.asList(splitted);


        for (String e : wordList) {
            System.out.println(e);
        }


        // 2. 리스트를 순화해서 전체 단어의 글자수의 평균을 구한다.

        int wordTotalCount = 0;

        for (String e : wordList) {
            wordTotalCount += e.length();
        }

        System.out.printf("글자수 평균은 %d개 입니다.\n",
                wordTotalCount / wordList.size());


        // 3. 단어가 5자 이하인 새로운 리스트를 생성한다.
        List<String> newList = new ArrayList<>();

        for (String e : wordList) {
            if (e.length() <= 5) {
                newList.add(e);
            }
        }

        System.out.println(newList);


    }

}







