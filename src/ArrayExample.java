/**
 * Created by danawacomputer on 2017-04-05.
 * element를 5로 나눠서 0으로 떨어지는 숫자는 bingo로 출력
 * 아니면 그냥 출력
 */
public class ArrayExample {
    public static void main(String[] args) {

//        int[] iArr = new int[10];
//        iArr[0] = 2;
//        iArr[1] = 4;
//        iArr[2] = 6;
//        iArr[3] = 8;
//        iArr[4] = 10;
//        iArr[5] = 12;
//        iArr[6] = 14;
//        iArr[7] = 16;
//        iArr[8] = 18;
//        iArr[9] = 20;
//
//        iArr[4] = 3500;
//
//        System.out.println(iArr[0]);
//        System.out.println(iArr[1]);
//        System.out.println(iArr[2]);
//        System.out.println(iArr[3]);
//        System.out.println(iArr[4]);
//        System.out.println(iArr[5]);
//        System.out.println(iArr[6]);
//        System.out.println(iArr[7]);
//        System.out.println(iArr[8]);
//        System.out.println(iArr[9]);

        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
                , 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
//
//        for (int e : iArr) {
//
//            String converted = String.valueOf(e);
//
//
//            if (converted.contains("3") || converted.contains("6") || converted.contains("9")) {
//                System.out.println("짝!");
//            } else {
//                System.out.println(e);
//            }
//
//
//        }
//
//        for (int e : iArr) {
//            if (e % 5 == 0) {
//                System.out.println("bingo!");
//
//            } else {
//                System.out.println(e);
//            }
//
//        }

        int sum = 0;
        for(int e : iArr) {

           sum = sum + e; // 누적 accumulation..
        }

        int countOfArr = iArr.length;

        System.out.println(sum / (double)countOfArr);

    }
}