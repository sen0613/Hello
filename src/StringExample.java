/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringExample {

    public static void main(String[] args) {

        String myStr = "Hello, World!";
        String myStr2 = " 안녕하세요.";

        String result = myStr + myStr2;

        String result2 = myStr + 1;

        String sliced = myStr.substring(0,5);
        boolean a = myStr.contains("Wor");
        boolean b = myStr.contains("Work");
        boolean c = myStr.startsWith("He");
        boolean d = myStr.startsWith("he");
        System.out.println(result + result2 + sliced + a + b + c + d);
    }
}
