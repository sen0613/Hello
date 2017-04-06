/**
 * Created by danawacomputer on 2017-04-05.
 * 1. 각 element의 글자수 평균 구하기
 * 2. 글자수가 3자 이하인 element의 배열 새로 만들기
 *
 */
public class StringArrayExample {
    public static void main(String[] args) {

        String[] strArr =
                {"숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지"
                , "은행골", "메이비", "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬"
                , "마루가메제면", "킹콩부대찌개 구로디지털점", "바른식탁", "말뚝곱창", "보나베띠"
                , "춘자싸롱", "황제해물보쌈", "호우 양꼬치"};

        // 1. 각 element의 글자수 평균 구하기

        int CharCount = 0;

        for (String e : strArr) {
            CharCount += e.length(); //CharCount = CharCount + e.length();
        }

        System.out.println((double)CharCount / strArr.length);



        // 2. 글자수가 3자 이하인 element의 배열 만들기

        String[] resultArr = new String[strArr.length];

        int count = 0;
        for (String e : strArr) {

            if (e.length() <= 3) {
                resultArr[count] = e;
                count++;
            }

        }

        for (String e : resultArr) {
            System.out.println(e);
        }




//        int strArrCnt = 0;
//        int newArrCnt = 0;
//
//
//        for (String e : strArr) {
//            if(e.length() <= 3) {
//
////                System.out.println(e);
//
////                System.out.println("NewArrIndex: " + newArrCnt);
//                newArrCnt++;
//            }
////            System.out.println("배열 검색 순번: " + strArrCnt);
//            strArrCnt++;
//        }
//        String[] newArr = new String [newArrCnt];
//
//        int savedCnt = 0;
//        int searchCnt = 0;
//        for (String e : strArr) {
//            if(e.length() <= 3) {
//
//                System.out.println(e);
//                newArr[savedCnt] = strArr[searchCnt];
////                System.out.println("NewArrIndex: " + newArrCnt);
//                savedCnt++;
//            }
////            System.out.println("배열 검색 순번: " + strArrCnt);
//            searchCnt++;
//        }

    }
}
