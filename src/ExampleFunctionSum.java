/**
 * Created by danawacomputer on 2017-04-06.
 * 문제
 * a+b를 구하라
 */
public class ExampleFunctionSum {

    public static void main(String[] args) {

        int a = sumData(3,4);
        System.out.println(a);


        System.out.println("합은"+sumData(5,6)+"입니다");
    }


    public static int sumData(int input1, int input2){
        int result = input1 + input2;
        return result;
    }
}
