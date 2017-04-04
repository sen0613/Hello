/**
 * Created by danawacomputer on 2017-04-04.
 */
public class VarTypeExample {

    public static void main(String[] args) {

        //integer type
        //int myInt = 2_100_000_000;

        int myInt; // 변수의 선언, 메모리 공간을 확보하다.
        myInt = 5; // 최초로 변수에 값을 담는 행위, 초기화

        myInt = 7; // 재할당, re-assignment


        long myLong = 9_000_000_000_000_000_000L;

        //floot type
        double myDouble = 3.141592;

        //string type
        String myStr = "Hello world";

        char myChar = 'a';

        //boolean type
        boolean myBool = true; // false

        System.out.println(myBool);
    }
}
