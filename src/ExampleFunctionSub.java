/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ExampleFunctionSub {

    public static void main(String[] args) {

        int answer = sub(10, 1);
        System.out.println(answer);

        System.out.println(sub(10, 1));
    }


    public static int sub(int num1, int num2) {
       int result = num1 - num2;
        return result;
    }

}
